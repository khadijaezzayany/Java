package polymorphisme2;

public class Video extends Ouvrage {
	private String editeur;
	private double duree;

	public Video(String titre, String dateCreation, boolean libre, String editeur, double duree) {
		super(titre, dateCreation, libre);
		this.editeur = editeur;
		this.duree = duree;
	}

	@Override
	public void afficher() {
		System.out.println("Titre de l'ouvrage : " + getTitre() + "\n" + "Auteur : " + this.editeur + "\n" + "Dur�e : "
				+ this.duree + "\n" + "Date de cr�ation : " + getDateCreation() + "\n" + "Disponible : " + isDispo()
				+ "\n");
	}

}
