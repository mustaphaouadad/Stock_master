<%@page import="Crud.Ajouter_produit"%>
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
String nameProduit=request.getParameter("nameProduit");
String descriptionProduit=request.getParameter("descriptionProduit");
String prix=request.getParameter("prix");
String quantite=request.getParameter("quantite");
String categorie=request.getParameter("categorie");



Ajouter_produit obj_Ajouter_produit=new Ajouter_produit();
obj_Ajouter_produit.Ajouter_produit(idProduit, nameProduit, descriptionProduit, prix, quantite, categorie);


%>

<script type="text/javascript">
window.location.href="http://localhost:8081/StockMaster/Ajouter_produit.jsp";
</script>

</body>
</html>