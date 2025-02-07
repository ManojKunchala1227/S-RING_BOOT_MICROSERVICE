<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

   <frm:form   modelAttribute="stu">
    <table align="center" bgcolor="cyan">
    	<tr>
    		<td>Student Id : </td>
    		<td><frm:input type="text" path="idNo"/></td>
    	</tr>
    	
    	<tr>
    		<td>Student Name : </td>
    		<td><frm:input type="text" path="name"  /> </td>
    	</tr>
    	
    	<tr>
    		<td>Location : </td>
    		<td><frm:input type="text" path="location" /></td>
    	</tr>
    	
    	<tr>
    		<td>Type of Course : </td>
    		<td><frm:input type="text" path="course"/></td>
    	</tr>
    	
    	<tr>
    		<td> Course fee : </td>
    		<td><frm:input type="text" path="fee"/></td>
    	</tr>
    	
    	<tr>
    		<td><input type="submit" name="Send" ></td>
    		<td><input type="reset" name="Cancel"></td>
    	</tr>
    	
    </table>
    
   </frm:form>