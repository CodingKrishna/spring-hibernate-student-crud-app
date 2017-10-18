<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="suresh"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<suresh:form commandName="userdto" action="userDetails.mmm">
		<div>UserDetails</div>
		<div>
			<table>
				<tr>
					<td>User Name</td>
					<td><suresh:input type="text" path="userName"></suresh:input></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><suresh:input type="text" path="email"></suresh:input></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><suresh:input type="text" path="phoneNum"></suresh:input></td>
				</tr>
				<tr>
					<td colspan="10" align="center"><input type="submit"
						value="Submit"></td>
				</tr>
			</table>
		</div>
	</suresh:form>
</body>
</html>