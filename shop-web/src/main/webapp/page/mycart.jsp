<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>购物车 - 在线购物系统</title>
    <%@include file="html/head.html"%>
    <link rel="stylesheet" type="text/css" href="/static/css/mycart.css"/>
    <script type="text/javascript" src="/static/js/style/mycart.js"></script>
    <script type="text/javascript" src="/static/js/ajax/cart.js"></script>
</head>
<body>
    <c:set var="cname" value="${sessionScope.cname}"/>
    <%@include file="html/title.html"%>
    <%@include file="html/search.html"%>
    <%@include file="html/menu.html"%>
    <%@include file="html/nav.html"%>
    <%@include file="html/user.html"%>
    <%@include file="html/mycart.html"%>
    <%@include file="html/foot.html"%>
    <%@include file="html/prompt.html"%>
</body>
</html>
