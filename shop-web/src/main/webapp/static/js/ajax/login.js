// 发送注册请求
function submitLogin(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/login.action",
        data:data,
        success:function (msg) {
            switch (msg){
                case "success":{
                    window.location.href="/";
                    break;
                }
                case "pno":{
                    prompt("密码错误！");
                    break;
                }
                case "cno":{
                    prompt("用户名不存在！");
                    break;
                }
                case "error":{
                    prompt("后台出现异常！");
                    break;
                }
                default:
            }
        },
        error:function () {
            prompt("ajax出错！");
        }
    });
}