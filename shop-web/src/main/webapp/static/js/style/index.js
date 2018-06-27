// 初始化页面
$(function () {
    //createRecommendPage();
    $(".shop-index-left ul li a").click(function () {
       var title = $(this).text();
       var data = {"info":title};
       search(data);
    });
})