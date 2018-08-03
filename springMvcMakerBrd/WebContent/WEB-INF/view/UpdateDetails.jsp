<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
window.history.forward();
function noBack()
{
    window.history.forward();
}
</script>
<body onLoad="noBack();" onpageshow="if (event.persisted) noBack();" onUnload="">

<script>

function validation()
{
var pincode =document.userForm.pincode.value;
var numbers = /^[0-9]+$/;
var email = document.userForm.email.value;
var con=document.userForm.contact.value;
var name=document.userForm.customername.value;
var letters = /^[A-Za-z]+$/;
var Email = /^([a-z A-Z 0-9 _\.\-])+\@(([a-z A-Z 0-9\-])+\.)+([a-z A-z 0-9]{3,3})+$/;
var add1=document.userForm.address1.value;
var flag=0;

if(pincode.match(numbers)){
	
}
else{
	alert('pincode should be a 6-digit Number');
	flag++;
}
if(pincode.length==6){}
else{
	alert('pincode should be a 6-digit Number');
	
}
if(email.match(Email)){
	
}
else {
	alert('Enter valid email');
	flag++;
}

 if (name==null || name=="")
{
alert("Please enter your name");
      flag++;
  }
 if(name.match(letters))
{

}
else
{
alert('Username must have alphabet characters only');
flag++;
}
if((con.match(numbers)))
{

}
else{
alert('Enter valid contact number');
flag++;}

if(con.length==0)
{
alert('Field cannot be empty');
}

if(add1.length==0)
{
alert('Address field cannot be empty');
return false;
}


if(con.length!=10)
{
alert('Contact Number should be a 10 digit number');
return false;
}

if(flag)
{
alert('Please Enter the Right Details for login');

return false;
}
else return true;
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
<form  name = "userForm" action="updated"  modelAttribute = "customer"method="POST">
  CustomerCode: <input type="text" name="customerCode" value="${customer.customerCode}" readonly/><br>		
		 CustomerName: <input type="text" name="customerName" value="${customer.customerName}"/><br>		
 Address1: <textarea name="customerAddress1">${customer.customerAddress1}</textarea><br>	
 Address2: <textarea name="customerAddress2">${customer.customerAddress2}</textarea><br>	
 PinCode: <input type="text" name="customerPincode" value="${customer.customerPinCode}"/><br>		
 e-mail Address: <input type="text" name="emailAddress" value="${customer.emailAddress}"/><br>		
  Contact Number: <input type="text" name="contactNumber" value="${customer.contactNumber}"/><br>		
  Primary Contact Person: <input type="text" name="primaryContactPerson" value="${customer.primaryContactPerson}"/><br>		
  <button type="submit" class="registerbtn" onclick="return validation()">Submit</button>
 
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
%>	 --%>
</body>
</html>