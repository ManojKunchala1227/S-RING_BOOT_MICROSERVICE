<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center"> Result Page</h1>

<b>Request Param  No :: ${param.st}, </b>
<br>
<br>
<b>Request Param Name :: ${paramValues.sname[0]}, ${paramValues.sname[1]},${paramValues.sname[2]} </b>
<br>
<br>
<b>Request Param Location :: ${paramValues.loc[0]},${paramValues.loc[1]},${paramValues.loc[2]} </b>
<br>
<br>
<b>Request Param Number :: ${paramValues.setNo[0]},${paramValues.setNo[1]},${paramValues.setNo[2]} </b>
<br>
<br>


</body>
</html>