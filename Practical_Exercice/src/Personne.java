

public class Personne {
	
	private String CIN;
	private String nom;
	private String prenom;
	public Personne(String CIN, String nom, String prenom) {
		
		this.CIN = CIN;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String toString() {
		return "Personne [CIN=" + CIN + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	public Personne() {
		
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String CIN) {
		CIN = CIN;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	

}
