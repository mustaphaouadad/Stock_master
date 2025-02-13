package Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import common.DB_Connection;


import common.produit_Bean;

public class Modifier_produit {
	
	public produit_Bean get_value_of_produit(String idProduit){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		produit_Bean obj_produit_Bean=new produit_Bean();
		try {
		 String querry="select * from produits where idProduit=?";
		 ps=connection.prepareStatement(querry);		
		 ps.setString(1, idProduit);;
		 rs=ps.executeQuery();
		 while(rs.next()){
			 
		 obj_produit_Bean.setIdProduit(rs.getString("idProduit"));
		 obj_produit_Bean.setNameProduit(rs.getString("nameProduit"));
		 obj_produit_Bean.setDescriptionProduit(rs.getString("descriptionProduit"));
		 obj_produit_Bean.setPrix(rs.getString("prix"));
		 obj_produit_Bean.setQuantite(rs.getString("quantite"));
		 obj_produit_Bean.setCategorie(rs.getString("categorie"));
	         }
		} catch (Exception e) {
		System.out.println(e);
		}
		return obj_produit_Bean;
	}
	public void modifier_produit(produit_Bean obj_produit_Bean){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
		String querry="update user set user_name=?,email=?,mobile=? where sl_no=?";
		 ps=connection.prepareStatement(querry);
		    ps.setString(1,obj_produit_Bean.getIdProduit());
			ps.setString(2, obj_produit_Bean.getNameProduit());
			ps.setString(3, obj_produit_Bean.getDescriptionProduit());
			ps.setString(4, obj_produit_Bean.getPrix());
			ps.setString(5, obj_produit_Bean.getQuantite());
			ps.setString(6, obj_produit_Bean.getCategorie());
		
		 ps.executeUpdate();
		} catch (Exception e) {
		System.out.println(e);
		}
	}

}
