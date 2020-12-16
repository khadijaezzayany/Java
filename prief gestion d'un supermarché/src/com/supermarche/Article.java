package com.supermarche;

public class Article {
	private String nom;
	private double prix;
	private boolean solde;

	public Article(String nom, double prix, boolean solde) {
		this.nom = nom;
		this.prix = prix;
		this.solde = solde;
	}

	public String getNom() {
		return nom;
	}

	public double getPrix() {
		return prix;
	}

	public boolean isSolde() {

		return solde;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void setSolde(boolean solde) {
		this.solde = solde;
	}

}
