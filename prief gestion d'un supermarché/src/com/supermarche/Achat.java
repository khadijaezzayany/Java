package com.supermarche;

public class Achat {

	private Article article;
	private int quantite;

	public Achat(Article article, int qauntite) {
		this.article = article;
		this.quantite = qauntite;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	/*
	 * public void setQuantite(int quantite) { this.quantite = quantite; }
	 */
	public double getPrix() {
		double pourcentage = 1; // if article with out sold the reduction is 100% -> 100/100=1
		// if article in sold the reduction is 30% -> 30/100=0.3
		if (article.isSolde()) {
			pourcentage = 0.3;

		}
		return quantite * article.getPrix() * pourcentage;

	}

	public void affiche() {
		String nom = article.getNom();
		double prixUnite = article.getPrix();
		double prixTotal = getPrix();
		String pourcentage = "";

		if (article.isSolde()) {
			pourcentage = " (3/10 prix)";
		}
		System.out.println(nom + " : " + prixUnite + " x " + quantite + " = " + prixTotal + " MAD" + pourcentage);
	}

}
