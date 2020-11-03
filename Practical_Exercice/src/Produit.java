
import java.util.ArrayList;
import java.util.Arrays;


public class Produit  {
	
	public String toString() {
		return "Produit [matricule_Produit=" + matricule_Produit + ", nom=" + nom + ", prix_unitaire=" + prix_unitaire
				+ ", Quantite=" + Quantite + "  ]";
	}
	private int matricule_Produit;
	private String nom;
	private double prix_unitaire;
	private int Quantite=0;
	
	static ArrayList<Produit> Produit= new ArrayList<Produit>() ;
	
public Produit () {
	
}

public Produit(int matricule_Produit,double prix_unitaire,int Quantite,String nom) {
	//Produit = new ArrayList<Produit>();
	this.matricule_Produit=matricule_Produit;
	this.prix_unitaire=prix_unitaire;
	this.Quantite=Quantite;
	this.nom=nom;
}





public ArrayList<Produit> getProduit() {
	return Produit;
}





public void setProduit(ArrayList<Produit> produit) {
	Produit = produit;
}





public int getMatricule_Produit() {
	return matricule_Produit;
}


public void setMatricule_Produit(int matricule_Produit) {
	this.matricule_Produit = matricule_Produit;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

public double getPrix_unitaire() {
	return prix_unitaire;
}


public void setPrix_unitaire(double prix_unitaire) {
	this.prix_unitaire = prix_unitaire;
}


public int getQuantite() {
	return Quantite;
}


public void setQuantite(int quantite) {
	Quantite = quantite;
}

public void ajout_nouveau_produit(Produit P) {
	Produit.add(P);
		
}
public void suppession_produit(Produit P) {
	 Produit.remove(P);
	
}
public void mise_a_jour(Produit P) {
	for(int i=0;i<=Produit.size();i++) {
		if(P.equals(Produit.get(i))){
			Produit.set(i, P);
		}
		else {
			System.out.println("produit n'existe pas");
			
		}
		
	}
}
public int nbr_Produit() {
	return Produit.size();	
	
	
}
 

public void List_Produit() {
	
	for (int i =0;i< Produit.size();i++) {
		System.out.println(Produit.get(i).toString());
		
	}
	
}


}
