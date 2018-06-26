// 加入购物车操作
function addCart(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/addCart.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                prompt("成功加入购物车！");
            }
            if(msg=="exist"){
                prompt("该商品已存在购物车！");
            }
            if(msg=="error"){
                prompt("后台出错！");
            }
        },
        error:function () {
            prompt("ajax出错！");
        }
    });
}
// 移除购物车指定id的商品
function removeCart(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/removeCart.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                $("#"+data["id"]).remove();
            }
        },
        error:function () {
            prompt("ajax出错！");
        }
    });
}