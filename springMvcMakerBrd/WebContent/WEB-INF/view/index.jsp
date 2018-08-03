<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index.jsp</title>
</head>
<body style="text-align:center" >
<div class="container">
<form action="processLoginForm" method="post">  
<h1>${message}</h1>
<br>
<br>
    UserName:<input type="text" name="userName"/><br/><br/> 
    
    Password(*):<input type="password" name="userPassword"/><br/><br/> 
     
    <input type="submit" value="login"/>  
    </form>  
    </div>
</body>
</html>