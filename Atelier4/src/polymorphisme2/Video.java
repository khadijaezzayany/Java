package polymorphisme2;

public class Video extends Ouvrage {
	private String editeur;
	private double duree;

	Video(String titre, String cetarioDate, boolean dispo, String editeur,
			double duréé) {
		super(titre, cetarioDate, dispo);
		this.duree = duréé;
		this.editeur = editeur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	@Override
	void afficher() {
		System.out.println("Titre : "+getTitre()+"Date de création : "+getCetarionDate()+"La durée : "+getDuree()+"Editeur : "+getEditeur());
	}

}
