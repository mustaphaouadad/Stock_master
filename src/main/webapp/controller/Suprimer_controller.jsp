<%@page import="Crud.Suprimer_produit"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String idProduit=request.getParameter("idProduit");

Suprimer_produit obj_Suprimer_produit=new Suprimer_produit();
obj_Suprimer_produit.suprimer_produit(idProduit);





%>
<script type="text/javascript">
window.location.href="http://localhost:8081/StockMaster/Ajouter_produit.jsp";
</script>

</body>
</html>