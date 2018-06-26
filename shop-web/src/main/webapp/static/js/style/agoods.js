$(function () {
    // 初始化商品添加
    $("input[name='goods_cancel']").click(function () {
        $("#addgoods").modal("hide");
    });
    $("input[name='goods_add']").click(function () {
        var id = $("input[name='id']").val();
        var img = $("input[name='img']").val();
        var title = $("input[name='title']").val();
        var info = $("input[name='info']").val();
        var name = $("input[name='name']").val();
        var price = $("input[name='price']").val();
        var stock = $("input[name='stock']").val();
        var para = $("input[name='para']").val();
        var type = $("input[name='type']").val();
        var weight = $("input[name='weight']").val();
        var data = {"id":id,"img":img,"title":title,"info":info,"name":name,"price":price,
            "stock":stock,"para":para,"type":type,"weight":weight};
        if(id==""||img==""||title==""||info==""||name==""||price==""||stock==""||para==""||type==""||weight==""){
            alert("输入框不能为空！");
            return;
        }
        addGoods(data);
    });
    // 初始化商品修改
    $("input[name='goods_cancel1']").click(function () {
        $("#updategoods").modal('hide');
    });
    $("input[name='goods_add1']").click(function () {
        var id = $("input[name='id1']").val();
        var img = $("input[name='img1']").val();
        var title = $("input[name='title1']").val();
        var info = $("input[name='info1']").val();
        var name = $("input[name='name1']").val();
        var price = $("input[name='price1']").val();
        var stock = $("input[name='stock1']").val();
        var para = $("input[name='para1']").val();
        var type = $("input[name='type1']").val();
        var weight = $("input[name='weight1']").val();
        var data = {"id":id,"img":img,"title":title,"info":info,"name":name,"price":price,
            "stock":stock,"para":para,"type":type,"weight":weight};
        if(id==""||img==""||title==""||info==""||name==""||price==""||stock==""||para==""||type==""||weight==""){
            alert("输入框不能为空！");
            return;
        }
        updateGoods(data);
    });
})