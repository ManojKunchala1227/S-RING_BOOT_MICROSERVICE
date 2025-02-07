<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <h1 style="color:red; text-align:center"> Dancer Registration Page</h1>
    
    <form action="register" method="POST">
    	<table>
    		<tr>
	    		<td>Dancer ID :</td>
	    		<td> <input type="text" name="did"></td>
	    	</tr>
	    	<tr>
	    		<td>Dancer Name :</td>
	    		<td><input type="text" name="name"></td>
	    	</tr>
	    	<tr>
	    		<td>Dancer Address :</td>
	    		<td> <input type="text" name="add"></td>
	    	</tr>
	    	<tr>
	    		<td>Type of Dance :</td>
	    		<td><input type="text" name="typeOfDancer"></td>
	    	</tr>
	    	<tr>
	    		<td>Dancer Fee :</td>
	    		<td><input type="text" name="fee"></td>
	    	</tr>
	    	
	    	<tr>
	    		<td><input type="submit" value="Send"></td>
	    		<td><input type="Reset" value="Cancel"></td>
	    	</tr>
    	</table>
    </form>