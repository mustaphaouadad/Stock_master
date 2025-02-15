package metier;

import java.math.BigDecimal;

public class Produit {
	private int idProduit;
	private String nameProduit;
	private String descriptionProduit;
	private BigDecimal prix;
	private int quantite;
	private Categorie categorie;
	
	public enum Categorie{
		Électronique, Beauté, Maison, Vêtements, Alimentation
	}
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public String getNameProduit() {
		return nameProduit;
	}
	public void setNameProduit(String nameProduit) {
		this.nameProduit = nameProduit;
	}
	public String getDescriptionProduit() {
		return descriptionProduit;
	}
	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}
	public BigDecimal getPrix() {
		return prix;
	}
	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String nameProduit, String descriptionProduit, BigDecimal prix, int quantite, Categorie categorie) {
		super();
		this.nameProduit = nameProduit;
		this.descriptionProduit = descriptionProduit;
		this.prix = prix;
		this.quantite = quantite;
		this.categorie = categorie;
	}
	public Produit(int idProduit, String nameProduit, String descriptionProduit, BigDecimal prix, int quantite,
			Categorie categorie) {
		super();
		this.idProduit = idProduit;
		this.nameProduit = nameProduit;
		this.descriptionProduit = descriptionProduit;
		this.prix = prix;
		this.quantite = quantite;
		this.categorie = categorie;
	}
	

}
