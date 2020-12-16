package com.supermarche;

//import java.sql.Date;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
import java.util.Date;

public class Caisse {

	private int numero;
	private double total;

	public Caisse(int numero, double total) {
		this.numero = numero;
		this.total = total;
	}

	public void montantTotal() {

		System.out.println("La caisse numero "+this.numero+" a encaisse "+this.total+". MAD aujourd'hui");
	}

	public void scanner(Chariot chariot) {
		System.out.println("------------------------------------------------");

		// Display Time
		SimpleDateFormat timeCuurentDate = new SimpleDateFormat("MM/dd/yyyy  hh:mm:ss");
		Date time = new Date(numero);
		System.out.println(timeCuurentDate.format(time));
		// Display number of caisses
		System.out.println("Caisse numéro " + numero + "\r");

		int nbAchat = chariot.getNbAchats();
		double montantTotal = 0;

		for (int i = 0; i < nbAchat; i++) {
			Achat achat = chariot.getAchat(i);
			double prix = achat.getPrix();
			achat.affiche();
			montantTotal += prix;
			total += prix;
		}

		System.out.println("\r Montant a payer : " + montantTotal + " MAD");
		System.out.println("------------------------------------------------");
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
