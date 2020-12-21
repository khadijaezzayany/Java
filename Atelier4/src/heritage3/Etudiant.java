package heritage3;

public class Etudiant extends Personne {
	private String diplome;

	public Etudiant(String nom, String prenom, String adresse, String ville, int dateNaissance, String diplome) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.diplome = diplome;
	}

	public String getDiplome() {
		return diplome;
	}

	public void ecrirePersonne() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Etudiant [diplome=" + diplome + super.toString() + "]";
	}

}
