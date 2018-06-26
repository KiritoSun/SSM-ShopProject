$(function () {
    // 点击菜单栏
    $("#left-nav").children("li").click(function () {
        $("#left-nav").children("li").each(function () {
           $(this).removeClass("active");
        });
       $(this).addClass("active");
       var action = $(this).attr("name");
       switch (action){
           case "custom":{
               $("iframe").attr("src","acustom.jsp");
               break;
           }
           case "admin":{
               $("iframe").attr("src","admin.jsp");
               break;
           }
           case "goods":{
               $("iframe").attr("src","agoods.jsp");
               break;
           }
           case "recommend":{
               $("iframe").attr("src","arecommend.jsp");
               break;
           }
           case "sort":{
               $("iframe").attr("src","asort.jsp");
               break;
           }
           case "cart":{
               $("iframe").attr("src","acart.jsp");
               break;
           }
           case "order":{
               $("iframe").attr("src","aorder.jsp");
               break;
           }
           case "exit":{
               window.location.href="alogin.jsp";
               break;
           }
           default:break;
       }
    });
})