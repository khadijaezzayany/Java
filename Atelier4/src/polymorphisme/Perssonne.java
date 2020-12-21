package polymorphisme;

public class Perssonne {
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private int naissance;

	public Perssonne(String nom, String prenom, String adresse, String ville, int naissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.naissance = naissance;
	}

	public void Afficher() {
		System.out.print("Nom:" + nom + "  Pénom:" + prenom + "  Adresse:" + adresse + "  Vill:" + ville
				+ "  Date de naissance:" + naissance);
	}
	

	public String getNom() {
		return nom;
	}

	
	

	public String getPrenom() {
		return prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getVille() {
		return ville;
	}

	public int getNaissance() {
		return naissance;
	}

}
