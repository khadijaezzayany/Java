package polymorphisme2;

public class Livre extends Ouvrage {
private String auteur;
	
	public Livre(String titre, String dateCreation, boolean libre, String auteur) {
		super(titre, dateCreation, libre);
		this.auteur = auteur;
	}
	
	
	@Override
	public void afficher() {
		System.out.println("Titre de l'ouvrage : " + getTitre() +"\n"
							+ "Auteur : " + this.auteur + "\n"
							+"Date de création : "+ getDateCreation() + "\n"
							+"Disponible : "+ isDispo() + "\n");
	}


	

}
