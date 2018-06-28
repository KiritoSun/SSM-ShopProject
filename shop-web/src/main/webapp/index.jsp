<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>在线购物系统</title>
    <%@include file="/page/html/head.html"%>
    <link rel="stylesheet" type="text/css" href="/static/css/index.css"/>
    <script type="text/javascript" src="/static/js/ajax/init.js"></script>
    <script type="text/javascript" src="/static/js/style/index.js"></script>
</head>
<body>
    <c:set var="cname" value="${sessionScope.cname}"/>
    <%@include file="/page/html/title.html"%>
    <%@include file="page/html/search.html"%>
    <%@include file="/page/html/menu.html"%>
    <%@include file="/page/html/nav.html"%>
    <%@include file="/page/html/user.html"%>
    <%@include file="/page/html/index.html"%>
    <%@include file="/page/html/foot.html"%>
    <%@include file="page/html/prompt.html"%>
</body>
</html>
