// 修改客户信息
function updateCustomInfo(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/updateCustom.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                prompt("信息修改成功！");
            }else{
                prompt("后台出错！");
            }
        },error:function () {
            prompt("ajax出错！");
        }
    });
}