package constructeur;

public class Employe {

	private String nom;
	private String prenom;
	private String adress;
	private int anneeNai;
	private int anneeEnc = 2020;

	public Employe(String nom, String prenom, String adress,
			int anneeNai, int anneeEnc) {

		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.anneeNai = anneeNai;
		this.anneeEnc = anneeEnc;

	}
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public int getAnneeNai() {
		return anneeNai;
	}


	public void setAnneeNai(int anneeNai) {
		this.anneeNai = anneeNai;
	}


	public int getAnneeEnc() {
		return anneeEnc;
	}


	public void setAnneeEnc(int anneeEnc) {
		this.anneeEnc = anneeEnc;
	}


	public void afficherInfosClient() {
		System.out.println(nom + " " + prenom + ", né le " + anneeNai
				+ " habitant à " + adress);

	}

	public int calculerAge() {
		int age = anneeEnc - anneeNai;
		return age;

	}

}
