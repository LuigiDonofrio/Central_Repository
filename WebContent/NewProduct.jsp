<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inserimento nuovo prodotto - SIW-SERVLET-ES7</title>
</head>
<body>
	<h1>Inserisci nuovo prodotto</h1>
	<form action="ProductController" method="get">
		<div>
			<b>Nome Prodotto</b><input type="text" name="nomeProdotto" value = <%if (request.getParameter("nomeProdotto")!=null) out.print(request.getParameter("nomeProdotto"));%>>
		</div>
		<div>
			<b>Prezzo Prodotto</b><input type="text" name="prezzoProdotto" value = <%if (request.getParameter("prezzoProdotto")!=null) out.print(request.getParameter("prezzoProdotto"));%>>€
		</div>
		<div>
			<b>Descrizione Prodotto</b><input type="text" name="descProdotto" value = <%if (request.getParameter("descProdotto")!=null) out.print(request.getParameter("descProdotto"));%>>
		</div>
		<input type="submit" value="invia">
		<div>
			<font color=red>
				<%
					if (request.getAttribute("error") != null)
						out.println(request.getAttribute("error"));
				%>
			</font>
		</div>
	</form>
</body>
</html>