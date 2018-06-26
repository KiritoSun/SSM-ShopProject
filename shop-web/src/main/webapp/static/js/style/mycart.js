$(function () {
    
    // 点击全选复选框
    $("input[name='allcheck']").change(function () {
       if(this.checked){
           var p = 0;
           $("input[name='check']").each(function () {
                $(this).prop("checked","checked");
                var price = $(this).parent("td").parent("tr").children("td[name='price']").text();
                price = Number(price);
                p+=price;
           });
           $("#allprice").text(p);
       }else{
           $("input[name='check']").each(function () {
               this.checked=!this.checked;
           });
           $("#allprice").text(0);
       }
    });

    // 选择单个复选框
    $("input[name='check']").change(function () {
        if(this.checked){
            var price = $(this).parent("td").parent("tr").children("td[name='price']").text();
            add_price(price);
        }
        else{
            var price = $(this).parent("td").parent("tr").children("td[name='price']").text();
            minus_price(price);
        }
    });

    // 删除选中操作
    $("input[name='delete']").click(function () {
       var id = $(this).parent("td").parent("tr").attr("id");
       var data = {"id":id};
       removeCart(data);
       prompt("删除成功！");
    });

    // 批量删除操作
    $("input[name='alldelete']").click(function () {
        var array = new Array();
        var i = 0;
        $("input[name='check']").each(function () {
           if(this.checked){
                array[i] = $(this).parent("td").parent("tr").attr("id");
                i++;
           }
        });
        if(array.length==0){
            prompt("未选中商品！");
            return;
        }
        else{
            array.forEach(function (value) {
                var data = {"id":value};
                removeCart(data);
            });
            prompt("删除成功！");
        }
    });

    // 批量生成支付页面
    $("input[name='pay']").click(function () {
        var ids = new Array();
        var imgs = new Array();
        var names = new Array();
        var numbers = new Array();
        var prices = new Array();
        var i = 0;
        $("input[name='check']").each(function () {
            if(this.checked){
                ids[i] = $(this).parent("td").parent("tr").attr("id");
                imgs[i] = $(this).parent("td").parent("tr").children("td[name='img']").children("img").attr("src");
                names[i] = $(this).parent("td").parent("tr").children("td[name='name']").text();
                numbers[i] = $(this).parent("td").parent("tr").children("td[name='number']").text();
                prices[i] = $(this).parent("td").parent("tr").children("td[name='price']").text();
                i++;
            }
        });
        if(imgs.length==0){
            prompt("未选中商品！");
            return;
        }
        else{
            var allprice = $("#allprice").text();
            var data = {"ids":ids,"imgs":imgs,"names":names,"numbers":numbers,"prices":prices,
                "allprice":allprice};
            createPaymentPage(data);
        }
    });

    // 价格增加函数
    function add_price(p) {
        var price = $("#allprice").text();
        p=Number(p);
        price=Number(price);
        price+=p;
        $("#allprice").text(price);
    }

    // 价格减少函数
    function minus_price(p) {
        var price = $("#allprice").text();
        p=Number(p);
        price=Number(price);
        price-=p;
        $("#allprice").text(price);
    }
})