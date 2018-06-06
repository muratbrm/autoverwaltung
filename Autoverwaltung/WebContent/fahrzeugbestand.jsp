<%@page import="java.util.ArrayList"%>
<%@page import="de.model.Auto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


	<table>
	    <tr>
	        <th>Modell</th>
	        <th>FIN</th>
	        <th>Baujahr</th>
	        <th>Motor</th>
	        <th>Türen</th>
	        <th>Leistung</th>
	        <th>Fahrzeugsart</th>
	        <th>Sitze</th>
	        <th>Ausstattung</th>
	        <th>Preis</th>
	
	    </tr>
		
		<c:forEach items="${autoList}" var="auto">
    <tr>      
        <td>${auto.modell}</td>
        <td>${auto.motor}</td>
        <td>${auto.leistung}</td>
        <td></td>
        <td></td>  
    </tr>
</c:forEach>
	</table>


</body>
</html>