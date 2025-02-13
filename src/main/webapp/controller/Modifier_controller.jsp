<%@page import="Crud.Modifier_produit"%>
<%@page import="common.produit_Bean"%>
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

produit_Bean obj_produit_Bean=new produit_Bean();
obj_produit_Bean.setIdProduit(idProduit);
obj_produit_Bean.setNameProduit(nameProduit);
obj_produit_Bean.setDescriptionProduit(descriptionProduit);
obj_produit_Bean.setPrix(prix);
obj_produit_Bean.setQuantite(quantite);
obj_produit_Bean.setCategorie(categorie);

Modifier_produit obj_Modifier_produit=new Modifier_produit();
obj_Modifier_produit.modifier_produit(obj_produit_Bean);




%>
<script type="text/javascript">
window.location.href="http://localhost:8081/StockMaster/Ajouter_produit.jsp";
</script>

</body>
</html>