<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Loan Eligibility</title>
</head>
<body style="background-color:powderblue;">
<div class="container">
<h2 class="text-center"> Loan details</h2>

<form class="form-horizontal" action="insert" method='post'>
  <div class="form-group">
    <label class="control-label col-sm-2" for="Id">Id:</label>
    <div class="col-sm-10">
      <input type="number" class="form-control" id="id" name="id" placeholder="Enter id">
    </div>
  </div>
  </form>
  </div>
  <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>