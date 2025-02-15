package DAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Statement;

import metier.Produit;
import metier.Produit.Categorie;

public class UserDao {
	private  String  jdbcURL = "jdbc:mysql://localhost:3306/Stock_master?useSSL=false";
	private String   jdbcUsername = "root";
	private String   jdbcPassword = "0000"; 
	 
	
	private static final String  INSERT_PRODUITS_SQL ="INSERT INTO produits" + " (nameProduit,descriptionProduit,prix,quantite,categorie)VALUES "
	  + "(?,?,?,?,?);";
	
	private static final java.lang.String SELECT_PRODUITS_BY_ID = "select idProduit,nameProduit,descriptionProduit,prix,quantite,categorie from produits where idProduit =?";
    private static final java.lang.String SELECT_ALL_PRODUITS = "select * from  produits";
    private static final java.lang.String DELETE_PRODUITS_SQL = "delete from  produits where idProduit = ?;";
    private static final java.lang.String UPDATE_PRODUITS_SQL = "update  produits set nameProduit = ?,descriptionProduit= ?, prix =?, quantite =?, categorie =? where idProduit = ?;";
    
    
    
    protected Connection getConnection() {
    	Connection connection =null;
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		connection =DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
    	return connection;
    }
    public void insertProduits(Produit produit) throws SQLException {
    	try(Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUITS_SQL)){
    		preparedStatement.setString(1, produit.getNameProduit());
    		preparedStatement.setString(2, produit.getDescriptionProduit());
    		preparedStatement.setBigDecimal(3, produit.getPrix());
    		preparedStatement.setInt(4, produit.getQuantite());
    		preparedStatement.setString(5, produit.getCategorie().name());
    		preparedStatement.executeUpdate();
    
    		
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
	
    public boolean  updateProduits(Produit produit) throws SQLException {
    	boolean rowUpdated;
    	try (Connection connection = getConnection();
    			PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUITS_SQL);){
    		statement.setString(1, produit.getNameProduit());
    		statement.setString(2, produit.getDescriptionProduit());
    		statement.setBigDecimal(3, produit.getPrix());
    		statement.setInt(4, produit.getQuantite());
    		statement.setString(5, produit.getCategorie().name());
    		statement.setInt(6, produit.getIdProduit());
    		
    		
    		rowUpdated =statement.executeUpdate()>0;
    		
    	}
    	return rowUpdated;
    	
		
	}
    public Produit selectProduit (int idProduit ) throws SQLException {
    	Produit produit =null;
    	try(Connection connection = getConnection();
    			PreparedStatement preparedStatement =connection.prepareStatement(SELECT_PRODUITS_BY_ID);){
    		preparedStatement.setInt(1, idProduit);
    		System.out.println(preparedStatement);
    		ResultSet rs = preparedStatement.executeQuery();
    		 while (( rs).next()) {
				String nameProduit =( rs) .getString("nameProduit");
				String descriptionProduit =( rs) .getString("descriptionProduit");
				 BigDecimal prix =rs .getBigDecimal("prix");
				int  quantite = rs .getInt("quantite");
				Categorie categorie = Categorie.valueOf(rs.getString("categorie"));
				
    		 }
			}catch (SQLException e) {
				e.printStackTrace();
			}
    		
    	
		return produit;
	}
    
    

   
	  
		
	
	

}
