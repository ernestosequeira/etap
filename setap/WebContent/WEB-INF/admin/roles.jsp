<%@ page language="java" contentType="text/html;" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page session="true"%>
<!DOCTYPE html>
<!--[if IE 9]><html class="lt-ie10" lang="en" > <![endif]-->
<html class="no-js" lang="en">
<head>
<title>Inicio</title>
<%@ include file="../plantillas/header.jspf"%>
</head>
<body>
	<%@ include file="../plantillas/menu.jspf"%>
	<%@ include file="../plantillas/breadcrumb.jspf"%>
	<h5>Roles</h5>
	<c:if test="${fn:length(lista) gt 0}">
		<c:set var="tot" scope="page">
			<c:out value="0" />
		</c:set>
		<table>
			<thead>
				<tr>
					<th width="200">Id</th>
					<th>Nombre</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="rol" items="${lista}" varStatus="indice">
				<tr>
					<td>${rol.idRol}</td>
					<td>${rol.nombre}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
	<%@ include file="../plantillas/footer.jspf"%>
</body>
</html>