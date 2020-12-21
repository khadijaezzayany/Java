package polymorphisme;

public class Employe extends Perssonne {

	

	private int salaire;

	public Employe(String nom, String prenom, String adresse, String ville, int naissance, int salaire) {
		super(nom, prenom, adresse, ville, naissance);
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}

	
	public void Afficher() {
		super.Afficher();
		System.out.println(" Salaire:" + salaire);

	}

	
	
}
