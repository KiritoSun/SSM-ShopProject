$(function () {
    // 取消按钮
    $("input[name='restart']").click(function () {
        window.location.href="/";
    });
    // 修改信息按钮
    $("input[name='update']").click(function () {
        var name = $("input[name='name']").val();
        var phone = $("input[name='phone']").val();
        var address = $("input[name='address']").val();
        var password = $("input[name='password']").val();
        var question = $("input[name='question']").val();
        var answer = $("input[name='answer']").val();
        var data = {"name":name,"phone":phone,"address":address,"password":password,
            "question":question,"answer":answer};
        updateCustomInfo(data);
    });
})