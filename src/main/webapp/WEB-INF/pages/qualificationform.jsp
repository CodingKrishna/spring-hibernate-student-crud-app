<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/candidateform.css">
</head>
<body>
<form:form  action="qualificationform.mmm" commandName="traineeQualificationDto" var="traineeQualificationDto" method="post">
<div class="col-md-4 col-md-offset-4">
	<div class="panel panel-danger">
		<div class="panel-body pl0 pr0 secondbody">
			<div class="col-md-12">
					<div class="form-group qualificationdetails">
						Qualification details
					</div>
			</div>
			<div class="clearfix"></div>
			<hr class="hrspace">
			<div class="col-md-4">
				<div class="form-group formgroupcolor">
					 Qualification:
				</div>
			</div>
			<div class="col-md-8 pl0">
				<div class="form-group formgroupcolor">
					<input class="form-control" placeholder="Enter Qualification" name="qualification" type="text">
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="col-md-4">
				<div class="form-group formgroupcolor">
					 Board/University:
				</div>
			</div>
			<div class="col-md-8 pl0">
				<div class="form-group formgroupcolor">
					<input class="form-control" placeholder="Enter Board/University" name="univarsity" type="text">
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="col-md-4">
				<div class="form-group formgroupcolor">
					 Percentage:
				</div>
			</div>
			<div class="col-md-8 pl0">
				<div class="form-group formgroupcolor">
					<input class="form-control" placeholder="Enter Percentage" name="percentage" type="text">
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="col-md-4">
				<div class="form-group formgroupcolor">
					 Year of Passing:
				</div>
			</div>
			<div class="col-md-8 pl0">
				<div class="form-group formgroupcolor">
					<input class="form-control" placeholder="Enter Year Of Passing yyyy-mm-dd" name="yearOfPass" type="text">
				</div>
			</div>
			<div class="clearfix"></div>
			<hr>
			<div class="col-md-2 col-md-offset-10">
						<button type="submit" ><i class="fa fa-arrow-circle-o-right fa-3x"></i>Next</button>
					</div>
		</div>
	</div>
</div>
</form:form>
</body>
<script src="<%=request.getContextPath()%>/resources/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</html>