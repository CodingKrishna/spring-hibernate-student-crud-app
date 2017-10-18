<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/candidateform.css">
</head>
<body>
	<form:form commandName="traineeDto" var="candit" action="register.mmm">
		<div class="col-md-4 col-md-offset-4">
			<div class="panel panel-danger firstbody">
				<div class="panel-body ">
					<div class="col-md-12 pl0">
						<div class="form-group studentdetails">Candit details</div>
					</div>
					<div class="clearfix"></div>
					<hr class="hrspace">
					<div class="col-md-4 pl0">
						<div class="form-group formgroupcolor">Full Name:</div>
					</div>
					<div class="col-md-8 pl0">
						<div class="form-group formgroupcolor">
							<form:input class="form-control" placeholder="Full Name"
								path="fullname" type="text" />
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="col-md-4 pl0">
						<div class="form-group formgroupcolor">Gender:</div>
					</div>
					<div class="col-md-8 pl0">
						<div class="form-group">
							<%-- <form:form role="form formgroupcolor "> --%>
								<label class="checkbox-inline formgroupcolor">
								 <form:radiobutton path="gender" value="Male" label="male"/>
								 
								</label> <label class="checkbox-inline formgroupcolor"> 
								<form:radiobutton path="gender" value="FeMale" label="FeMale"/>
								
								</label>
							<%-- </form:form> --%>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="col-md-4 pl0">
						<div class="form-group formgroupcolor">Contact Number:</div>
					</div>
					<div class="col-md-8 pl0">
						<div class="form-group">
							<form:input class="form-control" placeholder="Contact Number"
								path="contactNumber" type="text" />
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="col-md-4 pl0">
						<div class="form-group formgroupcolor">Mobile Number:</div>
					</div>
					<div class="col-md-8 pl0">
						<div class="form-group">
							<form:input class="form-control" placeholder="Mobile Number"
								path="mobileNumber" type="text" />
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="col-md-4 pl0">
						<div class="form-group formgroupcolor">Email:</div>
					</div>
					<div class="col-md-8 pl0">
						<div class="form-group">
							<form:input class="form-control" placeholder="Email Id"
								path="mobileNumber" type="text" />
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="col-md-4 pl0">
						<div class="form-group formgroupcolor">Date Of Birth:</div>
					</div>
					<div class="col-md-8 pl0">
						<div class="form-group">
							<form:input class="form-control" placeholder="Date Of Birth yyyy-mm-dd"
								path="birthDate" type="text" />
						</div>
					</div>
					<div class="clearfix"></div>
					<hr>
					<div class="col-md-2 col-md-offset-10">
						<button type="submit" class="btn btn-outline btn-none" ><i class="fa fa-arrow-circle-o-right fa-3x"></i>Next</button>
					</div>
				</div>
			</div>
		</div>
	</form:form>
</body>
<script src="<%=request.getContextPath()%>/resources/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</html>