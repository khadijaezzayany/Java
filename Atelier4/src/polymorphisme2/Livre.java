package polymorphisme2;

public class Livre extends Ouvrage {
	private String auteur;

	Livre(String titre, String cetarioDate, boolean dispo, String auteur) {
		super(titre, cetarioDate, dispo);
		this.auteur = auteur;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	void afficher() {
System.out.println("Titre : "+getTitre()+"Date de création : "+getCetarionDate()+"Auteur : "+getAuteur());
	}

}
