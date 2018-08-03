<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <title>Home page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">UserDetails</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="update">Update</a></li>
       <li class="active"><a href="adduser">NewUser</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">View<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="viewuser">SingleView</a></li>
          <li><a href="viewall">All</a></li>
          
        </ul>
      </li>
      <li><a href="deleteuser">Delete</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
      <li><a href="LogOutController"><span class="glyphicon glyphicon-log-in"></span> LogOut</a></li>
    </ul>
  </div>
</nav>

  <h1> welcome ${userName}</h1>
 
  <h2>${message}</h2>
<div class="container">
 
</div>
<%-- <%request.getSession(false);
if(session!=null){
	if(session.getAttribute("username")!=null){
		String userId=(String)session.getAttribute("message");
	}
	else{
		request.setAttribute("message","please login first");
		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request,response);
	}
}
%>
<%String message=(String)request.getAttribute("message");
if(message!=null){
	response.setContentType("text/html");
	out.println(message);
}
%> --%>
</body>
</html>
