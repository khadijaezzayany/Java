package com.supermarche;

//import java.sql.Date;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.time.format.DateTimeFormatter;
import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;

public class Caisse {

	private int numero;
	private double total;

	public Caisse(int numero, double total) {
		this.numero = numero;
		this.total = total;
	}

	public void montantTotal() {
		System.out.println("La caisse numero " + getNumero() + " a encaisse " + total + " MAD aujourd'hui.");
	}

	public void scanner(Chariot chariot) {
		System.out.println("=========================================");

		// Affichage date

		Date cuurentDatrFormat = new Date();
		System.out.println(cuurentDatrFormat);
		// SimpleDateFormat timeCuurentDate = new SimpleDateFormat("MM/dd/yyyy");

		System.out.println("Caisse numéro " + numero + "\n");

		int nbAchat = chariot.getNbAchats();
		double montantTotal = 0;

		for (int i = 0; i < nbAchat; i++) {
			Achat achat = chariot.getAchat(i);
			double prix = achat.getPrix();
			achat.affiche();
			montantTotal += prix;
			total += prix;
		}

		System.out.println("\n  Montant a payer : " + montantTotal + " MAD");
		System.out.println("=========================================");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
