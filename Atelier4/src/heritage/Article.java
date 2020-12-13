package heritage;

public class Article {

	private String nom;
	private int prix ;

	public void afficher() {
		System.out.println("le nom d'article est " +getNom()+" prix d'un article est " + getPrix());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	

}
