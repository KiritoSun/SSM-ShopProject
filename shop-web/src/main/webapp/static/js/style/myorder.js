// 订单页面js
$(function () {
    // 取消订单按钮
    $("input[name='delete_order']").click(function () {
       var id = $(this).parent("td").parent("tr").attr("id");
       var data = {"rid":id};
       removeOrder(data);
    });

    // 单击订单详细信息
    $("td[name='info']").click(function () {
        $("input[name='cancel3']").click(function () {
            $("#myModal6").modal('hide');
        });
        var id = $(this).parent("tr").attr("id");
        var names = new Array();
        var price = $(this).parent("tr").children("td[name='price']").text();
        var i = 0;
        $(this).parent("tr").children("td[name='names']").children("p").each(function () {
           names[i] = $(this).text();
           i++;
        });
        createOrderInfo(id,price,names);
    });
})