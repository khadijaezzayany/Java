package heritage2;

public class Compte {

	protected long numero;
	protected double solde;

	public Compte(double solde, long numero) {
		this.solde = solde;
		this.numero = numero;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	// Method Retrier
	public void Retirer(double solde) {
		if (this.solde >= solde) {
			this.solde -= solde;
		} else {
			System.out.println("Pas assez d'argent pour retirer");
		}
		System.out.println("Apre le retirage votre solde est " + getSolde());
	}

	// Method Afficher
	public void Afficher() {
		// this.numero=numero;
		// this.solde=solde;
		System.out.println("Le numéro de votre compte est " + getNumero() + " et votre solde est : " + getSolde());
	}

	// Method Ajouter
	public void Ajouter(double solde) {
		this.solde += solde;
		System.out.println("Apre l'ajoute votre solde est " + getSolde());
	}

}
