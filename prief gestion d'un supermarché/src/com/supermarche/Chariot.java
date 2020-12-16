package com.supermarche;

import java.util.ArrayList;

public class Chariot {

	private ArrayList<Achat> listeAchats;

	public Chariot() {

		this.listeAchats = new ArrayList<Achat>();
	}

	public void remplir(Article article, int quantite) {
		Achat achat = new Achat(article, quantite);
		listeAchats.add(achat);
	}

	public Achat getAchat(int index) {
		return listeAchats.get(index);
	}

	public int getNbAchats() {
		return listeAchats.size();
	}

}
