<%@ page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 style="color:green;text-align:center"> Welcome to Spring Boot JSP</h1>


<%-- <b>Model Attribute :: ${sysDate}</b> <br> --%>
<%-- <b>Model Attribute :: ${age}</b> <br> --%>


<!-- <h1 style="color:red; text-align:center"> -->
	
<!-- 	<b> -->
<!-- <!-- 	simple Values --> -->
<%-- 		Model Attribute :: ${name} --%>
		 
<!-- 	</b> -->
<!-- </h1> -->


<!-- <b> Array and Collection</b> <br> <br> -->
<!-- <!-- passing collections and Arrays --> -->
<%-- <% --%>
<!-- // String fav[]=(String[])request.getAttribute("colors"); -->
<!-- // List<String> name=(List<String>)request.getAttribute("names"); -->
<!-- // Set<Long> phoneNo=(Set<Long>)request.getAttribute("phoneNo"); -->
<!-- // Map<String,Object> details=(Map<String,Object>)request.getAttribute("idDetails"); -->

<%-- %> --%>

<%-- <b>Fav_Colors:: <%=Arrays.toString(fav) %></b><br> --%>
<%-- <b>Names      ::<%=name %></b><br> --%>
<%-- <b>phoneNo    ::<%=phoneNo %></b><br> --%>
<%-- <b>ID_Details ::<%=details %></b><br> --%>


<c:if test="${colors ne null}">

<c:forEach var="color" items="${colors}">
			${color},
</c:forEach>
	  
</c:if>

<c:if test="${names ne null }">

<c:forEach var="name" items="${names}">
	${name},
</c:forEach>

</c:if>

<c:if test="${phoneNo ne null }">

<c:forEach var="phno" items="${phoneNo}">
	${phno},
</c:forEach>
</c:if>

<c:if test="${idDetails ne null }">

<c:forEach var="details" items="${idDetails}">
	${details},
</c:forEach>

</c:if>



