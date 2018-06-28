// 初始化页面
$(function () {
    init();
    $(".shop-index-left ul li a").click(function () {
       var title = $(this).text();
       var data = {"info":title};
       search(data);
    });
})