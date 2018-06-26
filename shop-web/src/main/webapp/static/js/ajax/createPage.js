// 生成推荐页面
function createRecommendPage() {
    $.ajax({
        method: "POST",
        type: "POST",
        url: "/recommendPage.action",
        data: {},
        success: function (msg) {
            if (msg == "error") {
                prompt("后台出错！");
            }
            else {
                var json = JSON.parse(msg);
                $(".shop-recommend-body").html("");
                for (var e in json) {
                    $(".shop-recommend-body").append("<div class=\"shop-item\" id='"+json[e].id+"'>\n" +
                        "                <div class=\"shop-item-img\">\n" +
                        "                    <img src='" + json[e].img + "' width=\"146\" height=\"148\"/>\n" +
                        "                </div>\n" +
                        "                <div class=\"shop-item-title\">\n" +
                        "                    " + json[e].title + "\n" +
                        "                </div>\n" +
                        "                <div class=\"shop-item-info\">\n" +
                        "                    " + json[e].info + "\n" +
                        "                </div>\n" +
                        "            </div>");
                }
            }
        }, error: function () {
            prompt("ajax出错！");
        }
    });
}

// 生成页面分类
function createSortPage(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/sortPage.action",
        data: data,
        success:function (msg) {
            if(msg=="success"){
                window.location.href="/page/type.jsp";
            }else{
                prompt("后台出错！");
            }
        },error:function () {
            prompt("ajax出错！");
        }
    });
}

// 生成商品列表页面
function createGoodslistPage(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/goodslistPage.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                window.location.href="/page/goodsList.jsp";
            }else{
                prompt("后台出错！");
            }
        },error:function () {
            prompt("ajax出错！");
        }
    });
}

// 生成商品页面
function createGoodsPage(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/goodsPage.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                window.location.href="/page/goods.jsp";
            }else{
                prompt("后台出错！");
            }
        },error:function () {
            prompt("ajax出错！");
        }
    });
}

// 生成修改客户信息页面
function createUpdateCustom() {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/infoPage.action",
        data:{},
        success:function (msg) {
            if(msg=="success"){
                window.location.href="/page/myinfo.jsp";
            }
            else{
                prompt("后台出错！");
            }
        },
        error:function () {
            prompt("ajax出错！");
        }
    });
}

// 生成购物车页面
function createCartPage() {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/cartPage.action",
        data:{},
        success:function (msg) {
            if(msg=="success"){
                window.location.href="/page/mycart.jsp";
            }
            else{
                prompt("后台出错！");
            }
        },
        error:function () {
            prompt("ajax出错！");
        }
    });
}

// 生成订单页面
function createOrderPage() {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/orderPage.action",
        data:{},
        success:function (msg) {
            if(msg=="success"){
                window.location.href="/page/myorder.jsp";
            }else{
                prompt("后台出错！");
            }
        },error:function () {
            prompt("ajax出错！");
        }
    });
}

// 生成支付页面
function createPaymentPage(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/payPage.action",
        traditional: true,
        data:data,
        success:function (msg) {
            if(msg=="success"){
                window.location.href="payment.jsp";
            }else{
                prompt("后台出错！");
            }
        },
        error:function () {
            prompt("ajax出错！");
        }
    });
}

// 删除订单详情对话框
function createOrderInfo(id,price,names) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/orderInfo.action",
        data:{},
        success:function (msg) {
            var json = JSON.parse(msg);
            $("#order-rid").text(id);
            $("#order-cname").text(json.name);
            $("#order-address").text(json.address);
            $("#order-price").text(price);
            $("#order-names").children("td").each(function () {
                $(this).remove();
            });
            for(var j=0;j<names.length;j++){
                $("#order-names").append("<td>"+names[j]+"</td>");
            }
            $("#myModal6").modal();
        },error:function () {
            prompt("ajax出错！");
        }
    });
}