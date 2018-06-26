$(function () {
    // 初始化客户添加
    $("input[name='custom_cancel']").click(function () {
        $("#addcustom").modal("hide");
    });
    $("input[name='custom_add']").click(function () {
        var cname = $("input[name='cname']").val();
        var name = $("input[name='name']").val();
        var phone = $("input[name='phone']").val();
        var address = $("input[name='address']").val();
        var password = $("input[name='password']").val();
        var question = $("input[name='question']").val();
        var answer = $("input[name='answer']").val();
        var data = {"cname":cname,"name":name,"phone":phone,"address":address,"password":password,
            "question":question,"answer":answer};
        if(cname==""||name==""||phone==""||address==""||password==""||question==""||answer==""){
            alert("输入框不能为空！");
            return;
        }
        addCustom(data);
    });
    // 初始化客户修改
    $("input[name='custom_cancel1']").click(function () {
        $("#updatecustom").modal('hide');
    });
    $("input[name='custom_add1']").click(function () {
        var cname = $("input[name='cname1']").val();
        var name = $("input[name='name1']").val();
        var phone = $("input[name='phone1']").val();
        var address = $("input[name='address1']").val();
        var password = $("input[name='password1']").val();
        var question = $("input[name='question1']").val();
        var answer = $("input[name='answer1']").val();
        var data = {"cname":cname,"name":name,"phone":phone,"address":address,"password":password,
            "question":question,"answer":answer};
        if(cname==""||name==""||phone==""||address==""||password==""||question==""||answer==""){
            alert("输入框不能为空！");
            return;
        }
        updateCustom(data);
    });
})