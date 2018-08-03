<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <title>Add User</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body onLoad="noBack();" onpageshow="if (event.persisted) noBack();" onUnload="">>

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

<form:form  name ="userForm" action="addnewuser" modelAttribute = "customer" method="POST">
<TABLE>
  <TR>
    <TD>Customer Code</TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="customerCode" required>
    </TD>
  </TR>
   <TR>
    <TD>Customer Name</TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="customerName"  required SIZE="15">
    </TD>
  </TR>
  
<TR>
    <TD>Customer ADDRESS 1</TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="customerAddress1" required SIZE="15">
    </TD>
  </TR>
  
  <TR>
    <TD>Customer ADDRESS 2</TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="customerAddress2" required SIZE="15">
    </TD>
  </TR>
  
  <TR>
    <TD>PinCode</TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="customerPinCode"  required SIZE="15">
    </TD>
  </TR>
  
   <TR>
    <TD>Email Address</TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="emailAddress" required  SIZE="15">
    </TD>
  </TR>
  
   <TR>
    <TD>Contact Number</TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="contactNumber"  required SIZE="15">
    </TD>
  </TR>
  
<TR>
    <TD>PRIMARY CONTACT PERSON </TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="primaryContactPerson" required SIZE="15">
    </TD>
 <tr>
 
    <td> <br> </td> 
</tr>

  <tr>
    <td> <br> </td> 
    
</tr>
<tr>
<th>Record Status------------------------------------------------------------------  </th>

 </tr>
<tr><th>
<input type="radio" name="recordStatus" value="N">New
<input type="radio" name="recordStatus" value="M">Modified
<input type="radio" name="recordStatus" value="D">Delete
<input type="radio" name="recordStatus" value="A">Authorized
<input type="radio" name="recordStatus" value="R">Rejected
</th></tr>
<tr>
    <td> <br> </td> 
</tr>

<TR>
<th>Flag------------------------------------------------------------------------------</th>
 </tr
 >
 <tr> <th>
 <input type="radio" name="Flag" value="A">Active
<input type="radio" name="Flag" value="I">InActive
</th>
 </tr>

 
 <!-- <TR>
    <TD>Create Date </TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="createdate" SIZE="15">
    </TD>
 <tr>
  -->
 
  <TR>
    <TD>Created By </TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="createdby" value ="${username}" readOnly>
    </TD>

  
  <TR>
 <TD><button  type="SUBMIT"  NAME="customerController" onclick="return validation()"  >Submit Details</button><br></TD>
</TR>
</TABLE>
</form:form>


</body>
</html>