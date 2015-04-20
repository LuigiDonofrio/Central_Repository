<%@  page import = "pk1.Product" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Prodotto immesso</title>
</head>
<body>
	<h1>Specifiche del prodotto</h1>
	<div>
		<b>Nome Prodotto: </b>
		<%
			Product p = (Product)request.getAttribute("product");
			out.println(p.getNomeProdotto());
		%>
	</div>
	<div>
		<b>Prezzo Prodotto: </b>
		<%
			out.println(p.getPrezzoProdotto());
		%>€
	</div>
	<div>
		<b>Descrizione Prodotto: </b>
		<%
			out.println(p.getDescProdotto());
		%>
	</div>
</body>
</html>