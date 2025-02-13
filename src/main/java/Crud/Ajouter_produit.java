package Crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.DB_Connection;

public class Ajouter_produit {
	public void Ajouter_produit(String nameProduit ,String descriptionProduit,String  prix  ,String quantite,String categorie ) {
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		
	    try {
	    	String query="insert into user(ID,user_name,mobile,email) values(?,?,?,?)";
		ps=connection.prepareStatement(query);
		ps.setString(1, nameProduit);
		ps.setString(2, descriptionProduit);
		ps.setString(3, prix);
		ps.setString(4, quantite);
		ps.setString(5, categorie);
		
		ps.executeUpdate();
	    } catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
