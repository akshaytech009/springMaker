<%@page import="com.nucleus.model.persistence.entity.User" %>
<%@page import="com.nucleus.model.persistence.entity.Profile" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="profile" scope="session" value="${user.profile.profile}"/>
<c:if test="${profile=='M' }">
<jsp:forward page="/WEB-INF/view/welcomepage.jsp"/>
</c:if>


<c:if test="${profile=='C' }">
<jsp:forward page="/WEB-INF/view/checker.jsp"/>
</c:if>



</body>
</html>