$(function () {
    // 页面导航栏
    $(".shop-nav ul li").click(function () {
        var n = $(this).attr("name");
        if(n=="index"){
            window.location.href="/";
        }
        else{
            var data = {"action":n};
            createSortPage(data);
        }
    });

    // 搜索操作
    $("input[name='btn-search']").click(function () {
       var info = $("input[name='search']").val();
       if(info==""){
           prompt("搜索框不能为空！");
           return;
       }
       var data = {"info":info};
       search(data);
    });

    // 打开商品列表页面
    $(document).on('click','.shop-item',function(){
        var title = $(this).attr("id");
        var data = {"title":title};
        //createGoodsPage(data);
        createGoodslistPage(data);
    });

    // 打开商品页面
    $(document).on('click','.shop-item2',function(){
        var id = $(this).attr("id");
        var data = {"id":id};
        //createGoodsPage(data);
        createGoodsPage(data);
    });

    // 用户操作栏
    $(".shop-user-bottom ul li").click(function () {
        // 判断用户是否登录
        if($("#cname").text()==""){
            window.location.href="/page/login.jsp";
            return;
        }
       var item = $(this).attr("name");
       switch (item){
           case "update":{
               createUpdateCustom();
               break;
           }
           case "cart":{
               createCartPage();
               break;
           }
           case "order":{
               createOrderPage();
               break;
           }
           case "msg":{
               alert("发送信息！");
               break;
           }
           default:break;
       }
    });
})