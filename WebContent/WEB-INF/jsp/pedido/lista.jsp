<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/ep1-esw.css"/>"/>
	<title>ep1-esw</title>
</head>
<body>
	<h1>Pedidos Cadastrados</h1>
	<fieldset>
		<table>
			<tr>
				<td>Cliente</td><td>Data</td><td></td>
			</tr>
			<c:forEach items="${pedidoList}" var="i">
	           	<tr>
	               	<td>${i.client}</td>
	               	<td>${i.date}</td>
	               	<td><a class="buttonmizer" href="detalhes?id=${i.id }">detalhes</a></td>
	           	</tr>
	        </c:forEach>
	   	</table>
	</fieldset>
	<div id="back">
		<a class="buttonmizer" href="<c:url value="/"/>">Voltar</a>
	</div>
	<a href="<c:url value="/"/>"><img class="bg" src="<c:url value="/img/rose.png"/>"></a>
</body>
</html>