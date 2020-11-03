
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exit =0;
		Administrateur A=null;
			while(exit==0){
				
				Scanner console = new Scanner(System.in);
				System.out.println("enter admin username");
				
				String username = console.next();
				System.out.println("enter admin password");
				String password = console.next();
				 A = new Administrateur();
				if(A.authentication(username, password)==true) {
					System.out.println("Sgin in succeful");
					System.out.println("ajouter un utilisateur");
					System.out.println("CIN :");
					String cin = console.next();
					System.out.println("NOM :");
					String nom = console.next();
					System.out.println("Prenom :");
					String prenom = console.next();
					
					break;
					
				}
				else {
					System.out.println("sign in failed");
					System.out.println("to try again enter 0 to exit enter 1");
				}
	
				int ex=console.nextInt();
				exit=ex;
				System.out.println(exit);
			}
			
			Produit p1 = new Produit(1, 10, 10, "HRISSA");
			Produit p2 = new Produit(2, 10, 10, "tomate");
			Produit p3 = new Produit(3, 10, 10, "spaghetti");
			Produit p4 = new Produit(4, 10, 10, "bsisa");
			
			p1.toString();
			p2.toString();
			
			p1.ajout_nouveau_produit(p1);
			p1.ajout_nouveau_produit(p2);
			p1.ajout_nouveau_produit(p3);
			p1.ajout_nouveau_produit(p4);
			
			p1.List_Produit();
			
			p1.suppession_produit(p1);
			System.out.println("SUPPRESION D'UN ELEMENT");
			p1.List_Produit();
			
			
			Utilisateur U1= new Utilisateur("11234567","jack","bak");
			Utilisateur U2= new Utilisateur("11234567","rim","gazzeh");
			Utilisateur U3= new Utilisateur("11234567","dorra","idoudi");
			//U1.toString();
			System.out.println(U1);
			System.out.println("l'ajout des utilisateurs");
			U1.ajout_nouveau_Utilisateur(U1);
			U2.ajout_nouveau_Utilisateur(U2);
			U3.ajout_nouveau_Utilisateur(U3);
			U1.List_Utilisateur();
			
		
			
			U2.suppession_Utilisateur(U2);
			System.out.println("SUPPRESION D'UN UTILISATEUR");
			U1.List_Utilisateur();
			
			LigneCommande LC1 = new LigneCommande( 4, p1);
			LigneCommande LC2 = new LigneCommande( 2, p2);
			
			System.out.println(LC1);
			
			Commande C1 = new Commande ("pacha",1,1);
			System.out.println("AJOUT DU LIGNES DE COMMANDES");
			C1.ajouter_ligne_commande(LC1);
			C1.ajouter_ligne_commande(LC2);
			
			C1.afficher_commande();	
			
			
			
			
			
	}

}
