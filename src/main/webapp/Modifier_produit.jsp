
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="bg-light">

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
                <input type="number" id="quantite" name="quantite" placeholder="Quantité" class="form-control" required>
            </div>
            <div class="mb-3">
                <input type="number" id="prix" name="prix" step="0.01" placeholder="Prix" class="form-control" required>
            </div>
            <div class="mb-3">
                <select id="categorie" name="categorie" class="form-select">
                    <option value="Électronique">Électronique</option>
                    <option value="Vêtements">Beauté</option>
                    <option value="Alimentation">Maison</option>
                    <option  value="Vêtements">Vêtements</option>
                    <option  value="Alimentation">Alimentation</option>
                    
                </select>
            </div>
            <button type="submit" class="btn btn-success w-100">Modifier</button>
        </form>



</body>
</html>