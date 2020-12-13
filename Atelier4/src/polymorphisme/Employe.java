package polymorphisme;

public class Employe extends Perssonne {
	private int salaire;

	public Employe(String nom, String prenom, String adresse, String ville,
			int naissance, int salaire) {
		super(nom, prenom, adresse, ville, naissance);
		this.salaire = salaire;
		// TODO Auto-generated constructor stub
	}

	public void Afficher() {
		// TODO Auto-generated method stub
		System.out.println("\r");
		 super.Afficher();
		 System.out.print("  Salaire:"+ salaire);
	}

	public int getSalaire() {
		return salaire;
	}

}
