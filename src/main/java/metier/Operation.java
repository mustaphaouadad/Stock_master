package metier;

import java.util.ArrayList;
import java.util.Iterator;

public class Operation {
	private ArrayList<Produit> produits = new ArrayList<Produit>();

	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}
  public void Ajouter(Produit p) {
	  produits.add(p);
}
  
  public void Suprimer(int idProduit) {
	 for(Produit p:produits) {
		 if(p.getIdProduit()== idProduit) {
			 produits.remove(p);
			 break;
		 }
		 
	 }
}
  
  public ArrayList Aficher() {
	  return produits;
  }
}
