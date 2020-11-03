
import java.util.ArrayList;

public class Commande {
	
	String nom;
	int num;
	int id;
	
	ArrayList<LigneCommande> commande = new ArrayList<LigneCommande>();
	
	public Commande(String nom, int num, int id) {
		super();
		this.nom = nom;
		this.num = num;
		this.id = id;
	}

	public Commande() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Commande [nom=" + nom + ", num=" + num + ", id=" + id + "]"+ calculer_prix_total_commande();
	}
	
	
	public void ajouter_ligne_commande(LigneCommande lc) {
		
		
		commande.add(lc);
		
	}
	
	public float calculer_prix_total_commande() {
		float somme = 0;
		
		for (int i=0; i<commande.size();i++) {
			somme+=commande.get(i).getPrixtotal();
		}
		return somme;
	}
	
	public void afficher_commande() {
		commande.forEach((lc) -> System.out.println(lc.toString()));
		System.out.println(calculer_prix_total_commande());
	}
	
	
	
}
