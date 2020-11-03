

import java.util.ArrayList;

public class Administrateur extends Personne {
	
	String username="admin";
	String password="admin";
	static ArrayList<Utilisateur> Utilisateur = new ArrayList< Utilisateur>();
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Administrateur [username=" + username + ", password=" + password + "]";
	}
	public Administrateur() {
		
	}
	
	public boolean authentication(String username , String password) {
		
		if ((this.username.equals(username)) && (this.password.equals(password))) {
			return true;
		}else {
			return false;
		}
	}
	
	
		
	}
	
	
