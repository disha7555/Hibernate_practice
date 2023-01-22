<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" height="200px" width="100px">
<tr>
<th style="padding:5px"><strong style="font-size: 25px;">ID</strong></th>
<th style="padding:5px"><strong style="font-size: 25px;">FIRSTNAME</strong></th>
<th style="padding:5px"><strong style="font-size: 25px;">LASTNAME</strong></th>
</tr>
<c:forEach items="${sessionScope.list}" var="i">
        <tr>
        <td style="padding:11px"> <strong style="font-size: 25px;">${i.id}</strong></td>
        <td style="padding:11px"> <strong style="font-size: 25px;">${i.fn}</strong></td>
        <td style="padding:11px"> <strong style="font-size: 25px;">${i.ln}</strong></td>
        </tr>
</c:forEach>
</table>
</body>
</html>