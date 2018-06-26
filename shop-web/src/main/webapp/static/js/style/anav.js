$(function () {
    // 处理添加字段
    $(".panel-body-right-top ul li[name='add']").click(function () {
        var p = $(this).parent("ul").attr("name");
        switch (p){
            case "custom":{
                add_custom();
                break;
            }
            case "admin":{
                alert("管理员信息禁止添加！");
                break;
            }
            case "goods":{
                add_goods();
                break;
            }
            case "cart":{
                add_cart();
                break;
            }
            case "order":{
                add_order();
                break;
            }
            default:{
                alert("此为系统动态生成，禁止添加！");
                break;
            }
        }
    });
    // 处理删除字段
    $(".panel-body-right-top ul li[name='delete']").click(function () {
        var p = $(this).parent("ul").attr("name");
        switch (p){
            case "custom":{
                delete_info(p);
                break;
            }
            case "admin":{
                alert("管理员信息禁止删除！");
                break;
            }
            case "goods":{
                delete_info(p);
                break;
            }
            case "cart":{
                delete_info(p);
                break;
            }
            case "order":{
                delete_info(p);
                break;
            }
            default:{
                alert("此为系统动态生成，禁止删除！");
                break;
            }
        }
    });
    // 处理修改字段
    $(".panel-body-right-top ul li[name='update']").click(function () {
        var p = $(this).parent("ul").attr("name");
        switch (p){
            case "custom":{
                update_info(p);
                break;
            }
            case "admin":{
                alert("管理员信息禁止修改！");
                break;
            }
            case "goods":{
                update_info(p);
                break;
            }
            case "cart":{
                update_info(p);
                break;
            }
            case "order":{
                update_info(p);
                break;
            }
            default:{
                alert("此为系统动态生成，禁止修改！");
                break;
            }
        }
    });
    //处理刷新
    $(".panel-body-right-top ul li[name='refresh']").click(function (){
       window.location.reload();
    });
    // 处理添加客户信息
    function add_custom() {
        $("#addcustom").modal();
    }
    // 处理添加商品信息
    function add_goods() {
        $("#addgoods").modal();
    }
    // 处理购物车添加信息
    function add_cart() {
        $("#addcart").modal();
    }
    // 处理订单添加信息
    function add_order() {
        $("#addorder").modal();
    }
    // 处理批量删除信息
    function delete_info(table) {
        var array = new Array();
        var i = 0;
        $("input[name='check']").each(function () {
            if($(this).is(":checked")){
                var id = $(this).parent("td").parent("tr").attr("id");
                array[i] = id;
                i++;
            }
        });
        if(i==0){
            alert("未选中字段！");
            return;
        }
        for(var j=0;j<i;j++){
            delete_key(table,array[j]);
        }
    }

    // 处理修改信息
    function update_info(table) {
        var id;
        var i = 0;
        $("input[name='check']").each(function () {
            if($(this).is(":checked")){
                id = $(this).parent("td").parent("tr").attr("id");
                i++;
            }
        });
        if(i!=1){
            alert("请选中一条字段！");
            return;
        }
        switch (table){
            case "custom":{
                show_custom(id);
                break;
            }
            case "goods":{
                show_goods(id);
                break;
            }
            case "cart":{
                show_cart(id);
                break;
            }
            case "order":{
                show_order(id);
                break;
            }
        }
    }

    // 显示用户信息框
    function show_custom(id) {
        var cname = $("#"+id).children("td[name='cname']").text();
        var password = $("#"+id).children("td[name='password']").text();
        var name = $("#"+id).children("td[name='name']").text();
        var phone = $("#"+id).children("td[name='phone']").text();
        var question = $("#"+id).children("td[name='question']").text();
        var answer = $("#"+id).children("td[name='answer']").text();
        var address = $("#"+id).children("td[name='address']").text();
        $("input[name='cname1']").val(cname);
        $("input[name='password1']").val(password);
        $("input[name='name1']").val(name);
        $("input[name='phone1']").val(phone);
        $("input[name='question1']").val(question);
        $("input[name='answer1']").val(answer);
        $("input[name='address1']").val(address);
        $("#updatecustom").modal();
    }

    // 显示购物车信息框
    function show_cart(id) {
        var cname = $("#"+id).children("td[name='cname']").text();
        console.log(cname);
        var img = $("#"+id).children("td[name='img']").text();
        console.log(img);
        var name = $("#"+id).children("td[name='name']").text();
        console.log(name);
        var price = $("#"+id).children("td[name='price']").text();
        console.log(price);
        var number = $("#"+id).children("td[name='number']").text();
        console.log(number);
        var id = $("#"+id).children("td[name='xid']").text();
        console.log(id);
        $("input[name='cname1']").val(cname);
        $("input[name='id1']").val(id);
        $("input[name='img1']").val(img);
        $("input[name='name1']").val(name);
        $("input[name='price1']").val(price);
        $("input[name='number1']").val(number);
        $("#updatecart").modal();
    }

    // 显示商品信息框
    function show_goods(id) {
        var id = $("#"+id).children("td[name='id']").text();
        var weight = $("#"+id).children("td[name='weight']").text();
        var title = $("#"+id).children("td[name='title']").text();
        var info = $("#"+id).children("td[name='info']").text();
        var name = $("#"+id).children("td[name='name']").text();
        var price = $("#"+id).children("td[name='price']").text();
        var stock = $("#"+id).children("td[name='stock']").text();
        var para = $("#"+id).children("td[name='para']").text();
        var type = $("#"+id).children("td[name='type']").text();
        var img = $("#"+id).children("td[name='img']").text();
        $("input[name='id1']").val(id);
        $("input[name='weight1']").val(weight);
        $("input[name='title1']").val(title);
        $("input[name='info1']").val(info);
        $("input[name='name1']").val(name);
        $("input[name='price1']").val(price);
        $("input[name='stock1']").val(stock);
        $("input[name='para1']").val(para);
        $("input[name='type1']").val(type);
        $("input[name='img1']").val(img);
        $("#updategoods").modal();
    }

    // 显示订单信息框
    function show_order(id) {
        var rid = $("#"+id).children("td[name='rid']").text();
        var cname = $("#"+id).children("td[name='cname']").text();
        var ids = $("#"+id).children("td[name='ids']").text();
        var names = $("#"+id).children("td[name='names']").text();
        var price = $("#"+id).children("td[name='price']").text();
        $("input[name='rid1']").val(rid);
        $("input[name='cname1']").val(cname);
        $("input[name='ids1']").val(ids);
        $("input[name='names1']").val(names);
        $("input[name='price1']").val(price);
        $("#updateorder").modal();
    }
})