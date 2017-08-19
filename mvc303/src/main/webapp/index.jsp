<%--
  Created by IntelliJ IDEA.
  User: william
  Date: 16/7/18
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1 align="center">Welcom ^ ^</h1>
<form method="post" action="SelectBeer.do">
    <h2>Select beer characteristics</h2>
    <P></P>
    Color:
    <select name="color" size="1">
        <option value="light"> light </option>
        <option value="amber"> amber </option>
        <option value="brown"> brown </option>
        <option value="dark"> dark </option>
    </select>

    <br><br>
    <center>
        <input type="SUBMIT">
    </center>
</form>
</body>
</html>
