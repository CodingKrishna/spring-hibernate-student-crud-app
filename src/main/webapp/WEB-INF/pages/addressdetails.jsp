<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/candidateform.css">
</head>
<body>
<form:form action="addTraineeAddress.mmm" commandName="TraineeAddressDto" >
<div class="col-md-4 col-md-offset-4">
	<div class="panel panel-danger">
		<div class="panel-body pl0 pr0 thirddbody">
			<div class="col-md-12">
				<div class="form-group addressdetails">
					Address details
				</div>
			</div>
			<div class="clearfix"></div>
			<hr class="hrspace">
			<div class="col-md-4">
				<div class="form-group">
					 Current Address:
				</div>
			</div>
			<div class="col-md-8">
				<div class="form-group">
					<input   name="currentAddress"  placeholder="Enter Current Address">
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="col-md-4">
				<div class="form-group">
					 Perminent Address:
				</div>
			</div>
			<div class="col-md-8">
				<div class="form-group">
					 <input name="PerminentAddress" class="form-control" placeholder="Enter Perminent Address"  type="text">
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="col-md-4">
				<div class="form-group">
					 Pin Code:
				</div>
			</div>
			<div class="col-md-8">
				<div class="form-group">
					 <input name="pincode" class="form-control" placeholder="Enter Postal Code" type="text">
				</div>
			</div>
			<div class="clearfix"></div>
			<hr>
			<div class="col-md-2">
				<button type="submit" value="submit"><i class="fa fa-arrow-circle-o-left fa-3x"></i>Submit</button>
			</div>
		</div>
	</div>
</div>
</form:form>
</body>
</html>