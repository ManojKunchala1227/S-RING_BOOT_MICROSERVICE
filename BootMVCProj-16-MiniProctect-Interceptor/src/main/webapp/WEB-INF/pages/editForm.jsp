<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee Form Page</title>
</head>
<body>

<frm:form  action="updaterequest" method="POST" modelAttribute="emp">
<table align="center" bgcolor="cyan">
	
	<tr>
	<td>Emp Id :</td>
	<td> <frm:input path="id" readonly="true"/></td>
	</tr>
	
	<tr>
	<td>Name :</td>
	<td> <frm:input path="name"/></td>
	</tr>
	
	<tr>
	<td>Role :</td>
	<td> <frm:select path="role">
	<frm:option value=""></frm:option>
		<frm:option value="MANAGER"></frm:option>
		<frm:option value="SALESMAN"></frm:option>
		<frm:option value="CLEARK"></frm:option>
	</frm:select></td>
	</tr>
	
	<tr>
	<td>Salary :</td>
	<td> <frm:input path="salary"/></td>
	</tr>
	
	<tr>
	<td> <input type="submit" value="Edit Employee"> </td>
	<td> <input type="reset" value="Cancle"> </td>
	</tr>
</table>
</frm:form>

<br>
<br>
<a href="report"><button>Back</button></a>

<a href="./">Home</a>

</body>
</html>