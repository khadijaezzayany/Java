package heritage3;

public class Secretaire extends Personne {
	private String numeroBureau;

	public Secretaire(String nom, String prenom, String adresse, String ville,
			int dateNaissance, String numeroBureau) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.numeroBureau = numeroBureau;

	}

	public String getNumeroBureau() {
		return numeroBureau;
	}

	/*public String toString() {
		return (super.toString()+", numeroBureau=" + this.numeroBureau );
	}*/
		@Override
	public String toString() {
		return "Secretaire [NumeroBureau= " + getNumeroBureau()
				 + super.toString() + "]";
	}

	public void ecrirePersonne() {
		System.out.println(toString());

	}

}
