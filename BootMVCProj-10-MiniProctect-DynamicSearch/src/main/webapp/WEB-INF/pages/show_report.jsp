<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

	<frm:form action="search" method="POST" modelAttribute="emp">
		<table align="center" bgcolor="gray">
			<tr>
			<td>emp_name :</td>
			<td><frm:input path="name"/></td>
			</tr>
			<tr>
			<td>emp_role :</td>
			<td> <frm:select path="role">
				<frm:option value="MANEGER"></frm:option>
				<frm:option value="SALEMAN"></frm:option>
				<frm:option value="CLEARK"></frm:option>
			</frm:select>  </td>
			
			</tr>
			
			<tr>
			<td>emp_salary :</td>
			<td><frm:input path="salary"/></td>
			</tr>
			
			<tr>
			<td><input type="submit" value="Search with Data"/></td>
			<td><input type="reset" value="Cancle"/></td>
			</tr>
		</table>
	
	</frm:form>	
		
		
		<h1 style="text-align:center; color:blue"	>Report Data</h1>
		
		
		
<c:choose>

	<c:when test="${!empty emplist}">
	<table align="center" border="1" bgcolor="yellow">
		<tr>
		<th>EMPNO</th>
		<th>EMPNAME</th>
		<th>EMPROLE</th>
		<th>EMPSALARY</th>
		<th>OPTIONS</th>
		</tr>
	
	<c:forEach var="emp" items="${emplist}">
		<tr>
			<td>${emp.id }</td>
			<td>${emp.name }</td>
			<td>${emp.role }</td>
			<td>${emp.salary }</td>
			<td><a href="empedit?no=${emp.id }">Edit </a> <a onclick="return confirm('Are you sure delete?')" href="empdelete?no=${emp.id }">Delete</a></td>
														 
			
			
		</tr>
		</c:forEach>
	</table>	
	</c:when>
			<c:otherwise>
							<h1 style="color:red; text-align:center"> No Data Found</h1>
			</c:otherwise>
</c:choose>


<br>
<br>
<h2 style="text-align:center;color:green">${resultMsg}</h2>






<h3 style="text-align:center; color:green"><a href="addemp">Add EMployee</a></h3> 	
<br>
<br>
<br>

<h2 ><a href="./">Home</a></h2>
