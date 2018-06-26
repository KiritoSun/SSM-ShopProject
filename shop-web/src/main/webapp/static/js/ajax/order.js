// 提交订单
function submitOrder() {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/submitOrder.action",
        data:{},
        success:function (msg) {
            if(msg=="success"){
                $("#myModal3").modal("hide");
                $("#myModal4").modal();
            }else{
                $("#myModal3").modal("hide");
                $("#myModal5").modal();
            }
        },error:function () {
            prompt("ajax出错！");
        }
    });
}
// 删除订单
function removeOrder(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/removeOrder.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                $("#"+data["rid"]).remove();
            }else{
                alert("后台出错！");
            }
        },error:function () {
            alert("ajax出错！");
        }
    });
}