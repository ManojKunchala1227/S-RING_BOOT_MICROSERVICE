<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<frm:form modelAttribute="log">
	<table>
		<tr>
			<td> User Name :: </td>
			<td><frm:input type="username" path="userName" /></td>
		</tr>
		
		<tr>
			<td> Password :: </td>
			<td><frm:input type="password" path="passW" /></td>
		</tr>
		
		<tr>
			<td> <input type="submit" name="Send"></td>
			<td> <input type="reset" name="Cancel"></td>
		</tr>
	</table>

</frm:form>




</body>
</html>