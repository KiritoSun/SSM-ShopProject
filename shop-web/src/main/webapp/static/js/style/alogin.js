$(function () {
    // 绑定登录按钮
    $("input[name='submit']").click(function () {
        var cname = $("input[name='cname']").val();
        var password = $("input[name='password']").val();
        if (cname == "" || password == "") {
            prompt("输入框不能为空！");
            return;
        }
        var data = {"cname": cname, "password": password};
        adminLogin(data);
    });
})