package heritage2;

public class CompteEpargne extends Compte {
	public CompteEpargne(double solde, long numero) {
		super(solde, numero);
	}

	public void CalculeInterert(double taux) {
		double inte = solde * (taux / 100);
		// System.out.println(inte);

		if (solde >= 200) {
			solde = solde + inte;
			System.out.println("Votre solde apre calcul l'intéret est : " + solde);
		} else {
			System.out.println("Cette opération est refusé");
		}
	}

}
