<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<frm:form>
	<table>
	<tr>
	<td><sp:message code="registration.welcome" /></td>
	<td> <frm:input path="no"/></td>
	</tr>
	
	<tr>
	<td><sp:message code="registration.cust.name" /></td>
	<td> <frm:input path="name"/></td>
	</tr>
	<tr>
	<td><sp:message code="registration.cust.addrs" /></td>
	<td> <frm:input path="addrs"/></td>
	</tr>
	
	<tr>
	<td><sp:message code="registration.cust.mobileNo" /></td>
	<td> <frm:input path="mobileNo"/></td>
	</tr>
	
	<tr>
	<td> <input type="submit" >  </td>
	</tr>
	
	</table>
	
	
</frm:form>


</body>
</html>