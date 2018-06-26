$(function(){
	// 页面的js效果
    var max = $("#count").text();
    var price = $("#price").text();
	$(".add").click(function(){
		var n = $("input[name='number']").val();
		n++;
		if(n>max) n=max;
		$("input[name='number']").val(n);
		$("#price").text(price*n);
	});
	$(".minus").click(function(){
		var n = $("input[name='number']").val();
		n--;
		if(n<1) n=1;
		$("input[name='number']").val(n);
		$("#price").text(price*n);
	});

	// 加入购物车按钮
	$("input[name='addcart']").click(function () {
		if($("#cname").text()==""){
			window.location.href="/page/login.jsp";
			return;
		}
		var cname = $("#cname").text();
		var id = $(".shop-goods").attr("id");
		var img = $(".shop-goods-img").attr("src");
		var name = $(".shop-goods-info-title").text();
		var price = $("#price").text();
		var number = $("input[name='number']").val();
		var data = {"cname":cname,"id":id,"img":img,"name":name,"price":price,"number":number};
		addCart(data);
    });

	// 生成支付页面
	$("input[name='payment']").click(function () {
        if($("#cname").text()==""){
            window.location.href="/page/login.jsp";
            return;
        }
        var id = $(".shop-goods").attr("id");
        var img = $(".shop-goods-img").attr("src");
        var name = $(".shop-goods-info-title").text();
        var price = $("#price").text();
        var number = $("input[name='number']").val();
        var data = {"ids":id,"imgs":img,"names":name,"numbers":number,"prices":price,
			"allprice":price};
        createPaymentPage(data);
    });
})