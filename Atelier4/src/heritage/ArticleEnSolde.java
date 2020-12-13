package heritage;

public class ArticleEnSolde extends Article {

	public void afficher() {
		super.afficher();
		double prixApreReduction = getPrix() - (getPrix() * 0.3);
		System.out.println("le prix apre la réduction " + prixApreReduction);
	}
}
