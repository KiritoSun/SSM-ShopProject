// 判断帐户名是否存在
function decideCustomName(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/getCustom.action",
        data:data,
        success:function (msg) {
            if(msg=="no"){
                form2_style();
            }
            else{
                prompt("帐户名已存在！");
            }
        },
        error:function () {
            prompt("ajax出错！");
        }
    });
}
// 发送注册请求
function submitRegister(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/register.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                prompt2();
            }
            if(msg=="error"){
                prompt("后台出现异常！");
            }
        },
        error:function () {
            prompt("ajax出错！");
        }
    });
}