

public class LigneCommande {
	
	float prixtotal;
	int qte_achat;
	Produit p;
	
	public LigneCommande( int qte_achat, Produit p) {
		super();
		this.prixtotal = (float) (p.getPrix_unitaire()*qte_achat);
		this.qte_achat = qte_achat;
		this.p = p;
	}
	public float getPrixtotal() {
		return prixtotal;
	}
	public void setprixtotal(float prixtotal) {
		this.prixtotal = prixtotal;
	}
	public int getqte_achat() {
		return qte_achat;
	}
	public void setqte_achat(int qte_achat) {
		this.qte_achat = qte_achat;
	}
	public Produit getP() {
		return p;
	}
	public void setP(Produit p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "LigneCommande [prixtotal=" + prixtotal + ", qte=" + qte_achat+ ", p=" + p.toString() + "]";
	}
	
	

}
