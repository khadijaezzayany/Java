package heritage2;

public class CompteEpargne extends Compte {
	public CompteEpargne(double solde, long numero) {
		super(solde, numero);
		// TODO Auto-generated constructor stub
	}

	public void CalculeInterert(double taux) {
		double inte = solde * (taux / 100);
		System.out.println(inte);

		if (solde >= 200) {
			solde = solde + inte;
			System.out.println(solde);
		}
		else{
			System.out.println("si al7azr9");
		}
	}

}
