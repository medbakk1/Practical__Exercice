
import java.util.ArrayList;
import java.util.Arrays;

public class Utilisateur extends Personne  {
	private String CIN;
	private String nom;
	private String prenom;
	public Utilisateur(String CIN,String nom ,String prenom) {
	super(CIN,nom,prenom);
	
	
	}
	
	static ArrayList<Utilisateur> Utilisateur = new ArrayList<Utilisateur>() ;

	
	


	/*public Utilisateur(String CIN, String nom, String prenom) {
		
		this.CIN=CIN;
		this.nom=nom;
		this.prenom=prenom;
	}*/
	
	
	


	
	

	
	public String toString() {
		return super.toString();
	}





	public void List_Utilisateur() {
		
		for (int i =0;i< Utilisateur.size();i++) {
			System.out.println(Utilisateur.get(i).toString());
			
		}
		
	}
	public void ajout_nouveau_Utilisateur(Utilisateur U) {
		Utilisateur.add(U);
			
	}
	public void suppession_Utilisateur(Utilisateur U) {
		Utilisateur.remove(U);
		
	}

	
	public void mise_a_jour(Utilisateur U) {
		for(int i=0;i<=Utilisateur.size();i++) {
			if(U.equals(Utilisateur.get(i))){
				Utilisateur.set(i, U);
			}
			else {
				System.out.println("Utilisateur n'existe pas");
				
			}
			
		}

	




	}

}
	


