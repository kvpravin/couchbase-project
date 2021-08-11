<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class = "container">
<form method="post">
<table id="customerdetails"  border="1" class="table" >

<tbody style="color: black">


<tr>
					<td>Customer Id</td>
					<td>Customer name</td>
					<td>Customer Address</td>
				</tr>
				<c:forEach items="${custdetails}" var="requirementBean">
				<tr>
					<td>${requirementBean.getId()}</td>
					<td>${requirementBean.getName()}</td>
					<td>${requirementBean.getAddress()}</td>
					
					
					</tr>
			</c:forEach>
			
		</tbody>
		</table>
		</form>
		<a type="button" class="btn btn-primary"
						href="/">Click Here To Return To Home Page</a> 
		</div>
</body>
</html>