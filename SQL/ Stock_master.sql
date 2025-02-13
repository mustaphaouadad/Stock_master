create database Stock_master;

create table produits (
idProduit int(4) NOT NULL AUTO_INCREMENT,
nameProduit varchar(120) NOT NULL,
descriptionProduit varchar(500),
prix DECIMAL(10,2) NOT NULL,
quantite int(10) NOT NULL,
categorie ENUM('Électronique', 'Beauté', 'Maison', 'Vêtements', 'Alimentation'),
PRIMARY KEY (idProduit)
);