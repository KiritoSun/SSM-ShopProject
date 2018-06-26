// 验证管理员身份
function adminLogin(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/alogin.action",
        data:data,
        success:function (msg) {
            switch (msg){
                case "success":{
                    window.location.href="/page/aindex.jsp";
                    break;
                }
                case "pno":{
                    prompt("密码错误！");
                    break;
                }
                case "ano":{
                    prompt("用户名不存在！");
                    break;
                }
                case "error":{
                    prompt("后台出现异常！");
                    break;
                }
                default:
            }
        },error:function () {
            prompt("ajax出错！");
        }
    });
}

// 添加客户信息字段
function addCustom(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/register.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                $("#addcustom").modal("hide");
                window.location.reload();
            }else {
                alert("添加出错！");
            }
        },error:function () {
            alert("ajax出错！");
        }
    });
}

// 添加商品信息字段
function addGoods(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/addGoods.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                $("#addgoods").modal("hide");
                window.location.reload();
            }else {
                alert("添加出错！");
            }
        },error:function () {
            alert("ajax出错！");
        }
    });
}

// 添加购物车信息字段
function addCart(data) {
    $.ajax({
        method: "POST",
        type: "POST",
        url: "/addCart.action",
        data: data,
        success: function (msg) {
            if (msg == "success") {
                $("#addcart").modal("hide");
                window.location.reload();
            } else {
                alert("添加出错！");
            }
        }, error: function () {
            alert("ajax出错！");
        }
    });
}

// 添加订单信息字段
function addOrder(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/addOrder.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                $("#addorder").modal("hide");
                window.location.reload();
            }else {
                alert("添加出错！");
            }
        },error:function () {
            alert("ajax出错！");
        }
    });
}

// 修改客户信息
function updateCustom(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/updateCustom2.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                $("#updatecustom").modal('hide');
                window.location.reload();
            }else {
                alert("添加出错！");
            }
        },error:function () {
            alert("ajax出错！");
        }
    });
}

// 修改商品信息
function updateGoods(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/updateGoods.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                $("#updategoods").modal("hide");
                window.location.reload();
            }else {
                alert("添加出错！");
            }
        },error:function () {
            alert("ajax出错！");
        }
    });
}

// 修改购物车信息
function updateCart(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/updateCart.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                $("#updatecart").modal("hide");
                window.location.reload();
            }else {
                alert("添加出错！");
            }
        },error:function () {
            alert("ajax出错！");
        }
    });
}

// 修改订单信息
function updateOrder(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/updateOrder.action",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                $("#updateorder").modal("hide");
                window.location.reload();
            }else {
                alert("添加出错！");
            }
        },error:function () {
            alert("ajax出错！");
        }
    });
}

// 删除字段
function delete_key(table,id) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/deleteItem.action",
        data:{"table":table,"id":id},
        success:function (msg) {
            if(msg=="success"){
                window.location.reload();
            }else {
                alert("添加出错！");
            }
        },error:function () {
            alert("ajax出错！");
        }
    });
}