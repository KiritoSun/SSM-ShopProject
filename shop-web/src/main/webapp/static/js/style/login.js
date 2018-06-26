// 初始化页面
$(function () {
    $("input[name='submit']").click(function () {
        var cname = $("input[name='user']").val();
        var password = $("input[name='password']").val();
        if(cname==""||password=="") {
            prompt("输入框不能为空！");
            return;
        }
        var data = {
            "cname":cname,
            "password":password
        };
        submitLogin(data);
    });
})