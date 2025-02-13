package Crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DB_Connection;
import common.produit_Bean;



public class Affiche_produit {
	public static void main(String[] args) {
		Affiche_produit obj_Affiche_produit=new Affiche_produit();
		obj_Affiche_produit.get_produit();
	}
	public List<produit_Bean> get_produit() {
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<produit_Bean> list=new ArrayList<produit_Bean>();


	
	try {
		
		String querry="select *from produits";
		ps=connection.prepareStatement(querry);
		rs=ps.executeQuery();
		while (rs.next()) {
			produit_Bean obj_produit_Bean=new produit_Bean();
			System.out.println(rs.getString("idProduit"));
			System.out.println(rs.getString("nameProduit"));
			System.out.println(rs.getString("descriptionProduit"));
			System.out.println(rs.getString("prix"));
			System.out.println(rs.getString("quantite "));
			System.out.println(rs.getString("categorie  "));
			
			
			obj_produit_Bean.setNameProduit(rs.getString("idProduit"));
			obj_produit_Bean.setNameProduit(rs.getString("nameProduit"));
			obj_produit_Bean.setDescriptionProduit(rs.getString("descriptionProduit"));
			obj_produit_Bean.setPrix(rs.getString("prix"));
			obj_produit_Bean.setQuantite(rs.getString("quantite"));
			obj_produit_Bean.setCategorie(rs.getString("categorie"));
			
			list.add(obj_produit_Bean);
			
		}
		
		
	} catch (Exception e) {
		System.out.println(e);
	}
	return list;
	
	
	
	
}
}