// 初始化提示对话框
function prompt(msg) {
    $("#dialog-info").html(msg);
    $("#myModal").modal();
}
function prompt2() {
    $("#tologin").click(function () {
        window.location.href="login.jsp";
    });
    $("#myModal2").modal();
}
