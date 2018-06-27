<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>信息修改 - 在线购物系统</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <%@include file="html/head.html"%>
    <link rel="stylesheet" type="text/css" href="/static/css/myinfo.css"/>
    <script type="text/javascript" src="/static/js/style/myinfo.js"></script>
    <script type="text/javascript" src="/static/js/ajax/info.js"></script>
</head>
<body>
    <c:set var="cname" value="${sessionScope.cname}"/>
    <%@include file="html/title.html"%>
    <%@include file="html/search.html"%>
    <%@include file="html/menu.html"%>
    <%@include file="html/nav.html"%>
    <%@include file="html/user.html"%>
    <%@include file="html/myinfo.html"%>
    <%@include file="html/foot.html"%>
    <%@include file="html/prompt.html"%>
</body>
</html>
