<%@page import="common.produit_Bean"%>
<%@page import="Crud.Modifier_produit"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="bg-light">

<%
String idProduit=(String)request.getParameter("idProduit");
Modifier_produit obj_modifier_Produit=new Modifier_produit();
produit_Bean obj_produit_Bean=obj_modifier_Produit.get_value_of_produit(idProduit);
%>
<div class="container py-5">
        <h1 class="text-center mb-4"> Modifier Liste des produits</h1>

        <form id="ajouterProduitForm" class="bg-white p-4 rounded shadow-sm mb-4">
            <div class="mb-3">
                <input type="text" id="nom" name="nom" placeholder="Nom du produit" class="form-control" required>
            </div>
            <div class="mb-3">
                <input type="text" id="description" name="description" placeholder="Description" class="form-control">
            </div>
            <div class="mb-3">
                <input type="number" id="quantite" name="quantite" placeholder="Quantit�" class="form-control" required>
            </div>
            <div class="mb-3">
                <input type="number" id="prix" name="prix" step="0.01" placeholder="Prix" class="form-control" required>
            </div>
            <div class="mb-3">
                <select id="categorie" name="categorie" class="form-select">
                    <option value="�lectronique">�lectronique</option>
                    <option value="V�tements">Beaut�</option>
                    <option value="Alimentation">Maison</option>
                    <option  value="V�tements">V�tements</option>
                    <option  value="Alimentation">Alimentation</option>
                    
                </select>
            </div>
            <button type="submit" class="btn btn-success w-100">Modifier</button>
        </form>



</body>
</html>