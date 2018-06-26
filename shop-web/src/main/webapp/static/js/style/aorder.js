$(function () {
    // 初始化订单添加
    $("input[name='order_cancel']").click(function () {
        $("#addorder").modal("hide");
    });
    $("input[name='order_add']").click(function () {
        var rid = $("input[name='rid']").val();
        var cname = $("input[name='cname']").val();
        var ids = $("input[name='ids']").val();
        var names = $("input[name='names']").val();
        var price = $("input[name='price']").val();
        var data = {"rid":rid,"cname":cname,"ids":ids,"names":names,"price":price};
        if(rid==""||cname==""||ids==""||names==""||price==""){
            alert("输入框不能为空！");
            return;
        }
        addOrder(data);
    });
    // 初始化订单修改
    $("input[name='order_cancel1']").click(function () {
        $("#updateorder").modal('hide');
    });
    $("input[name='order_add1']").click(function () {
        var rid = $("input[name='rid1']").val();
        var cname = $("input[name='cname1']").val();
        var ids = $("input[name='ids1']").val();
        var names = $("input[name='names1']").val();
        var price = $("input[name='price1']").val();
        var data = {"rid":rid,"cname":cname,"ids":ids,"names":names,"price":price};
        if(rid==""||cname==""||ids==""||names==""||price==""){
            alert("输入框不能为空！");
            return;
        }
        updateOrder(data);
    });
})