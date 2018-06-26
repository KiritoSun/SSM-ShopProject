// 获取客户验证问题
function getCustomQuestion(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/getCustom.action",
        data: data,
        success:function (msg) {
            if(msg=="no"){
                prompt("该用户不存在！");
            }
            else {
                msg = JSON.parse(msg);
                sessionStorage.setItem("cname",msg['cname']);
                sessionStorage.setItem("question",msg['question']);
                sessionStorage.setItem("answer",msg['answer']);
                window.location.href="forget2.jsp";
            }
        },
        error:function () {
            prompt("ajax出错！");
        }
    });
}
// 重置客户密码
function updateCustomPassword(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/updatePassword.action",
        data:{
            "cname":cname,
            "password":password
        },
        success:function (msg) {
            if(msg=="success"){
                prompt2();
                sessionStorage.removeItem("cname");
                sessionStorage.removeItem("question");
                sessionStorage.removeItem("answer");
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