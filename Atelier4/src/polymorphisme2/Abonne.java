package polymorphisme2;

public class Abonne extends Ouvrage {
	private int identite;
	private int numeroAbonnement;
	private String nom;
	private String ouvragePris;

	public Abonne(String titre, String dateDeCreation, boolean libre, int identite, int numeroAbonnement, String nom,
			String ouvragePris) {
		super(titre, dateDeCreation, libre);
		this.identite = identite;
		this.numeroAbonnement = numeroAbonnement;
		this.nom = nom;
		this.ouvragePris = ouvragePris;
	}

	public void afficher() {
		System.out.println("Numéro d'identité : " + this.identite + "\n" + "Numéro d'abonnement : "
				+ this.numeroAbonnement + "\n" + "Nom : " + this.nom + "\n" + "Ouvrage pris : " + this.ouvragePris);
	}

	public int getIdentite() {
		return identite;
	}

	public void setIdentite(int identite) {
		this.identite = identite;
	}

	public int getNumeroAbonnement() {
		return numeroAbonnement;
	}

	public void setNumeroAbonnement(int numeroAbonnement) {
		this.numeroAbonnement = numeroAbonnement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getOuvragePris() {
		return ouvragePris;
	}

	public void setOuvragePris(String ouvragePris) {
		this.ouvragePris = ouvragePris;
	}

}
