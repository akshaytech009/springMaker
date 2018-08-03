<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>View</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<script type="text/javascript">
window.history.forward();
function noBack()
{
    window.history.forward();
}
</script>
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
	<form action="/viewall" method="GET">
		<table style="width: 100%">
			<thead>
				 
				<tr>
					<th>Customer Id</th>
					<th>Customer Code</th>
					<th>Customer Name</th>
					<th>Customer Address1</th>
					<th>Customer Address2</th>
					<th>Customer PinCode</th>
					<th>Customer Email</th>
					<th>Customer ContactNumber</th>
				</tr>

				<c:forEach items="${customer}" var="customer">
				<tr>
					<td><c:out value="${customer.customerId}" /></td>
					<td><c:out value="${customer.customerCode}" /></td>
					<td><c:out value="${customer.customerName}" /></td>
					<td><c:out value="${customer.customerAddress1}" /></td>
					<td><c:out value="${customer.customerAddress2}" /></td>
					<td><c:out value="${customer.customerPinCode}" /></td>
					<td><c:out value="${customer.emailAddress}" /></td>
					<td><c:out value="${customer.contactNumber}" /></td>
				</tr>
				 </c:forEach>
			</thead>
		</table>
	</form>
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
%>
 --%>
</body>
</html>