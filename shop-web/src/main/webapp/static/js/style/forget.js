// 初始化页面
$(function () {

    // 单击取消按钮
    $("#f-cancel").click(function () {
        window.location.href="/page/login.jsp";
        sessionStorage.removeItem("cname");
        sessionStorage.removeItem("question");
        sessionStorage.removeItem("answer");
    });

    // 单击下一步按钮
    $("#f-next1").click(function () {
       var cname = $("input[name='cname']").val();
       if(cname=="") {
           prompt("输入框不能为空！");
           return;
       }
       var data = {"cname":cname};
       getCustomQuestion(data);
    });

    //  显示问题
    $("#f-question").html(sessionStorage.getItem("question"));

    // 验证答案
    $("#f-next2").click(function () {
        var answer = $("input[name='answer']").val();
        if(sessionStorage.getItem("answer")==answer){
            window.location.href="forget3.jsp";
        }
        else{
            prompt("问题验证出错！");
        }
    });

    // 修改密码
    $("#f-submit").click(function () {
        var password = $("input[name='password']").val();
        if(password==""){
            prompt("输入框不能为空！");
            return;
        }
        var cname = sessionStorage.getItem("cname");
        var data = {"cname":cname,"password":password};
        updateCustomPassword(data);
    });
})