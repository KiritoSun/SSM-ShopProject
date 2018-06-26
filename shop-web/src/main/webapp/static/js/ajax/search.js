// 处理搜索操作
function search(data) {
    $.ajax({
       method:"POST",
       type:"POST",
       url:"/search.action",
       data: data,
       success:function (msg) {
            if(msg=="success"){
                window.location.href="/page/goodsList.jsp";
            }else{
                prompt("后台出错！");
            }
       },error:function () {
           prompt("ajax出错！");
       }
    });
}