
<%@page import="java.util.List, java.util.Iterator"%>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion de stock</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container py-5">
        <h1 class="text-center mb-4">Liste des produits</h1>

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
            <button type="submit" class="btn btn-success w-100">Ajouter un produit</button>
        </form>

        <div class="table-responsive">
            <table id="produitsTable" class="table table-bordered table-striped">
                <thead class="table-dark">
                    <tr>
                        <th>Nom</th>
                        <th>Description</th>
                        <th>Quantité</th>
                        <th>Prix</th>
                        <th>Catégorie</th>
                    </tr>
                </thead>
                <tbody>
                    
                </tbody>
            </table>
        </div>
    </div>
    
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>