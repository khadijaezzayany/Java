package polymorphisme2;

public abstract class Ouvrage {

	private String titre;
	private String dateCreation;
	private boolean dispo;

	

	public Ouvrage(String titre, String dateCreation, boolean dispo) {
		super();
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.dispo = dispo;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	public void afficher() {
		System.out.println("Titre de l'ouvrage : " + this.titre + "\n" + "Date de création : " + this.dateCreation
				+ "\n" + "Disponible : " + this.dispo);
	}

}
