// 初始化注册页面
$(function () {
    form1_style();
    $("#next1").click(function(){
        var cname = $("input[name='cname']").val();
        var password = $("input[name='password']").val();
        var repassword = $("input[name='repassword']").val();
        if(cname==""||password==""||repassword==""){
            prompt("输入框不能为空！");
            return;
        }
        if(password!=repassword){
            prompt("密码输入不一致!");
            return;
        }
        var data = {"cname":cname};
        decideCustomName(data);
    });
    $("#last1").click(function(){
        form1_style();
    });
    $("#next2").click(function(){
        var name = $("input[name='name']").val();
        var phone = $("input[name='phone']").val();
        var address = $("input[name='address']").val();
        if(name==""||phone==""||address==""){
            prompt("输入框不能为空！");
            return;
        }
        form3_style();
    });
    $("#last2").click(function(){
        form2_style();
    });
    $("input[name='submit']").click(function () {
        var cname = $("input[name='cname']").val();
        var password = $("input[name='password']").val();
        var name = $("input[name='name']").val();
        var phone = $("input[name='phone']").val();
        var address = $("input[name='address']").val();
        var question = $("input[name='question']").val();
        var answer = $("input[name='answer']").val();
        if(question==""||answer==""){
            prompt("输入框不能为空！");
            return;
        }
        var data = {
            "cname":cname,
            "password":password,
            "name":name,
            "phone":phone,
            "address":address,
            "question":question,
            "answer":answer
        };
        submitRegister(data);
    });
})
// 第一个表单效果
function form1_style() {
    var form1 = $("#form-1");
    var form2 = $("#form-2");
    var form3 = $("#form-3");
    form2.hide();
    form3.hide();
    form1.show();
    $("#point1 div").removeClass("point-2").addClass("point-1");
    $("#point1 span").removeClass("point_span2").addClass("point_span1");
    $("#point2 div").removeClass("point-1").addClass("point-2");
    $("#point2 span").removeClass("point_span1").addClass("point_span2");
    $("#point3 div").removeClass("point-1").addClass("point-2");
    $("#point3 span").removeClass("point_span1").addClass("point_span2");
}
// 第二个表单效果
function form2_style() {
    var form1 = $("#form-1");
    var form2 = $("#form-2");
    var form3 = $("#form-3");
    form1.hide();
    form3.hide();
    form2.show();
    $("#point2 div").removeClass("point-2").addClass("point-1");
    $("#point2 span").removeClass("point_span2").addClass("point_span1");
    $("#point1 div").removeClass("point-2").addClass("point-1");
    $("#point1 span").removeClass("point_span2").addClass("point_span1");
    $("#point3 div").removeClass("point-1").addClass("point-2");
    $("#point3 span").removeClass("point_span1").addClass("point_span2");
}
// 第三个表单效果
function form3_style() {
    var form1 = $("#form-1");
    var form2 = $("#form-2");
    var form3 = $("#form-3");
    form1.hide();
    form2.hide();
    form3.show();
    $("#point1 div").removeClass("point-2").addClass("point-1");
    $("#point1 span").removeClass("point_span2").addClass("point_span1");
    $("#point2 div").removeClass("point-2").addClass("point-1");
    $("#point2 span").removeClass("point_span2").addClass("point_span1");
    $("#point3 div").removeClass("point-2").addClass("point-1");
    $("#point3 span").removeClass("point_span2").addClass("point_span1");
}