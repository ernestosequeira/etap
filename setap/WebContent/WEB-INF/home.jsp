<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<!--[if IE 9]><html class="lt-ie10" lang="en" > <![endif]-->
<html class="no-js" lang="en">
<head>
<title>Inicio</title>
<%@ include file="plantillas/header.jspf"%>
</head>
<body>
	<%@ include file="plantillas/menu.jspf"%>
	<%@ include file="plantillas/breadcrumb.jspf"%>	
	<h3>Spring MVC Customized Login Logout !!!</h3>    
    <a href='<c:url value='/spring_security_login'/>'>Login</a>
    <c:if test="${pageContext.request.userPrincipal.name != null}">
    	Who is currently logged in? <c:out value='${CurrPrincipal}' /> !<br /> 
    	<a href='<c:url value='/j_spring_security_logout'/>'>Logout</a>
    </c:if>
	<script>
		$(document).ready(function() {
			console.info('cargado');
		});
	</script>
	<%@ include file="plantillas/footer.jspf"%>
</body>
</html>