package polymorphisme;

public class Chef extends Employe {
	private String service;

	public Chef(String nom, String prenom, String adresse, String ville, int naissance, String service) {
		super(nom, prenom, adresse, ville, naissance, naissance);
		this.service = service;
	}

	public String getService() {
		return service;
	}

	@Override
	public void Afficher() {
		super.Afficher();
		System.out.println(" Service:"+service);

	}



}
