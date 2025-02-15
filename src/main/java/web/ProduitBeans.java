package web;

import java.util.Vector;

import metier.Produit;

public class ProduitBeans {
	
	private Produit produit =new Produit();
	private Vector<Produit> liste =new Vector<Produit>();
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Vector<Produit> getListe() {
		return liste;
	}
	public void setListe(Vector<Produit> liste) {
		this.liste = liste;
	}
	

}
