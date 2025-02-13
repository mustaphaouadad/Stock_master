package Crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.DB_Connection;

public class Suprimer_produit {
	
	public void suprimer_produit (String idProduit) {
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		
		

		try {
			
			String querry="delete from produits where idProduit=?";
			ps=connection.prepareStatement(querry);
			ps.setString(1, idProduit);
			ps.executeUpdate();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

}
}
