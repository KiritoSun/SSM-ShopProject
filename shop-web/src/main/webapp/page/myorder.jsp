<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>订单查看 - 在线购物系统</title>
    <%@include file="html/head.html"%>
    <link rel="stylesheet" type="text/css" href="/static/css/myorder.css"/>
    <script type="text/javascript" src="/static/js/style/myorder.js"></script>
    <script type="text/javascript" src="/static/js/ajax/order.js"></script>
</head>
<body>
    <c:set var="cname" value="${sessionScope.cname}"/>
    <%@include file="html/title.html"%>
    <%@include file="html/search.html"%>
    <%@include file="html/menu.html"%>
    <%@include file="html/nav.html"%>
    <%@include file="html/user.html"%>
    <%@include file="html/myorder.html"%>
    <%@include file="html/foot.html"%>
    <%@include file="html/prompt.html"%>
</body>
</html>
