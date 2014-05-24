<%@ page language="java" contentType="text/html;" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<!DOCTYPE html>
<!--[if IE 9]><html class="lt-ie10" lang="en" > <![endif]-->
<html class="no-js" lang="en">
<head>
	<title>Organismos</title>
	<%@ include file="../plantillas/header.jspf"%>
</head>
<body>
	<%@ include file="../plantillas/menu.jspf"%>
	<%@ include file="../plantillas/breadcrumb.jspf"%>	
	
	<h5>Organismos</h5>
	<table>
			<c:forEach var="i" begin="0" end="1">
  				 <c:out value="${Organismos[i].nombre}"/>
			</c:forEach>

	</table>
	
	<%@ include file="../plantillas/footer.jspf"%>
</body>
</html>