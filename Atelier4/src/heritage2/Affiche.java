package heritage2;

public class Affiche {

	public static void main(String[] args) {
		// CompteEpargne first = new CompteEpargne(200, 18238812);
		CompteCourant first = new CompteCourant(200, 171267362713L);
		first.Afficher();
		// first.CalculeInterert(10.3);
		first.Ajouter(22);
		first.Retirer(10);

		System.out.println("\r");
		CompteEpargne second = new CompteEpargne(200, 18238812);
		// CompteCourant second = new CompteCourant(199, 122267362713L);
		second.Afficher();
		second.CalculeInterert(10.3);
		second.Ajouter(22);
		second.Retirer(10);
	}

}
