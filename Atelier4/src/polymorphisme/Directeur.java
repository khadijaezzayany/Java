package polymorphisme;

public class Directeur extends Chef {
	private String societe;

	public Directeur(String nom, String prenom, String adresse, String ville, int naissance, String service,
			String societe) {
		super(nom, prenom, adresse, ville, naissance, service);
		// TODO Auto-generated constructor stub
		this.societe = service;
	}

	public String getSociete() {
		return societe;
	}

	@Override
	public void Afficher() {
		super.Afficher();
		System.out.println(" Societe:"+societe);

	}


	

	

}
