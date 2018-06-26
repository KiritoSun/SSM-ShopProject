$(function () {
    // 初始化购物车添加
    $("input[name='cart_cancel']").click(function () {
        $("#addcart").modal("hide");
    });
    $("input[name='cart_add']").click(function () {
        var cname = $("input[name='cname']").val();
        var id = $("input[name='id']").val();
        var img = $("input[name='img']").val();
        var name = $("input[name='name']").val();
        var price = $("input[name='price']").val();
        var number = $("input[name='number']").val();
        var data = {"cname": cname, "id": id, "img": img, "name": name, "price": price, "number": number};
        if (cname == "" || id == "" || img == "" || name == "" || price == "" || number == "") {
            alert("输入框不能为空！");
            return;
        }
        addCart(data);
    });
    // 初始化购物车修改
    $("input[name='cart_cancel1']").click(function () {
        $("#updatecart").modal('hide');
    });
    $("input[name='cart_add1']").click(function () {
        var cname = $("input[name='cname1']").val();
        var id = $("input[name='id1']").val();
        var img = $("input[name='img1']").val();
        var name = $("input[name='name1']").val();
        var price = $("input[name='price1']").val();
        var number = $("input[name='number1']").val();
        var data = {"cname": cname, "id": id, "img": img, "name": name, "price": price, "number": number};
        if (cname == "" || id == "" || img == "" || name == "" || price == "" || number == "") {
            alert("输入框不能为空！");
            return;
        }
        updateCart(data);
    });
})