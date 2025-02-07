<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

   <form action="register" method="post">
    <table align="center" bgcolor="cyan">
    	<tr>
    		<td>Student Id : </td>
    		<td><input type="text" name="idNo"></td>
    	</tr>
    	
    	<tr>
    		<td>Student Name : </td>
    		<td><input type="text" name="name"></td>
    	</tr>
    	
    	<tr>
    		<td>Type of Course : </td>
    		<td><input type="text" name="course"></td>
    	</tr>
    	
    	<tr>
    		<td> Course fee : </td>
    		<td><input type="text" name="fee"></td>
    	</tr>
    	
    	<tr>
    		<td><Input type="submit" name="Send" ></td>
    		<td><input type="reset" name="Cancel"></td>
    	</tr>
    	
    </table>
    
   </form>