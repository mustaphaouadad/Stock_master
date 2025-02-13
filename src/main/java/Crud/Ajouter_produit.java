package Crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.DB_Connection;

public class Ajouter_produit {
	public void Ajouter_produit(String idProduit ,String nameProduit ,String descriptionProduit,String  prix  ,String quantite,String categorie ) {
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		
	    try {
	    	String query="insert into produits(idProduit,nameProduit,descriptionProduit,prix,quantite,categorie) values(?,?,?,?,?,?)";
		ps=connection.prepareStatement(query);
		ps.setString(1, idProduit);
		ps.setString(2, nameProduit);
		ps.setString(3, descriptionProduit);
		ps.setString(4, prix);
		ps.setString(5, quantite);
		ps.setString(6, categorie);
		
		ps.executeUpdate();
	    } catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
