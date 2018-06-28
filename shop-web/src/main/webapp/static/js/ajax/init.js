function init() {
    $.ajax({
       method:"POST",
       type:"POST",
       url:"/init.action",
       data:{},
       success:function (msg) {
           if(msg=="success"){
           }else{
               prompt("系统初始化出错！");
           }
       },error:function () {
            prompt("系统初始化出错！");
        }
    });
}