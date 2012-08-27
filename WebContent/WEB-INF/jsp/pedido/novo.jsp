<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/ep1-esw.css"/>"/>
	<title>ep1-esw</title>
	<script type="text/javascript" src="<c:url value="/js/jquery.js"/>"></script>
</head>
<body>
	<h1>Fazer Pedido</h1>
	<form action="<c:url value="salva"/>" method="post">
		<fieldset>
    		Nome:<br>
    		<input type="text" name="pedido.client"/><br/>
			Data:<br> 
			<input type="text" name="pedido.date"/><br/>
			Itens:
			<table>
				<tr>
					<td>Descricao</td><td>Qtd</td><td>Preco</td><td></td>
				</tr>
				<tr class="item">
					<td><input type="text" name="item[0].description"/></td>
					<td><input type="text" name="item[0].amount"/></td>
					<td><input type="text" name="item[0].price"/></td>
					<td><input class="removeitem buttonmizer" type="button" value="-"/></td>
				</tr>
			</table>
			<input class="buttonmizer additem" type="button" value="Adicionar"/>	
			<input class="buttonmizer" type="submit" value="Finalizar"/>
		</fieldset>
	</form>
	<div id="back">
		<a class="buttonmizer" href="<c:url value="/"/>">Voltar</a>
	</div>
	<a href="<c:url value="/"/>"><img class="bg" src="<c:url value="/img/rose.png"/>"></a>
	
	
	<script type="text/javascript">
		var count=0;
		$(".removeitem").click(function(){
			if($(".item").length > 1){
				$(this).parents(".item").remove();
			}
		});
		$(".additem").click(function(){
			count++;
			var last = $(".item:last");
			var newline = last.clone(true);
			newline.find("input[type=text]").each(function(i){
				var fieldname = $(this).attr("name").split(".")[1];
				$(this).attr("name", "item["+count+"]."+fieldname);
				$(this).val("");
			});
			last.find("input[type=text]").each(function(i){
				$(this).focus(function(){
					$(this).blur();
				});
			});
			newline.insertAfter(last);
		});
	
	</script>
</body>
</html>