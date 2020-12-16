package heritage3;

public class Enseignant extends Personne {
	private String specialite;

	public Enseignant(String nom, String prenom, String adresse, String ville,
			int dateNaissance, String spcialite) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.specialite = spcialite;
	}

	/*public String toString() {
		return (super.toString() + ", spcialite=" + this.specialite);
	}*/
		@Override
	public String toString() {
		return "Enseignant [specialite=" + specialite  + super.toString() + "]";
	}

	public String getSpecialite() {
		return specialite;
	}

	public void ecrirePersonne() {
		System.out.println(toString());
	}

}
