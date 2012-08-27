<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/ep1-esw.css"/>"/>
	<title>ep1-esw</title>
</head>
<body>
	<h1>Controle de Pedidos do Nhaga</h1>
	<div id="inicio">
		<a class="buttonmizer" href="<c:url value="/novo"/>">Fazer pedido</a>
		<a class="buttonmizer" href="<c:url value="/lista"/>">Listar Pedidos</a>
	</div>
	<img class="bg" src="<c:url value="/img/rose.png"/>">
</body>
</html>