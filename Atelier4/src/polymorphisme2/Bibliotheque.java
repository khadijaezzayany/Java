package polymorphisme2;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Bibliotheque  extends Ouvrage{

	public Bibliotheque(String titre, String dateCreation, boolean dispo) {
		super(titre, dateCreation, dispo);
	}

	private static ArrayList <Ouvrage> ouvrages = new ArrayList <Ouvrage>();
	private static ArrayList <Abonne> abonnes = new ArrayList <Abonne>();
	public static ArrayList<Ouvrage> getOuvrages() {
		return ouvrages;
	}
	public static void setOuvrages(ArrayList<Ouvrage> ouvrages) {
		Bibliotheque.ouvrages = ouvrages;
	}
	public static ArrayList<Abonne> getAbonnes() {
		return abonnes;
	}
	public static void setAbonnes(ArrayList<Abonne> abonnes) {
		Bibliotheque.abonnes = abonnes;
	}

	public static void ajoutAbonne(Abonne name) {
		for (int i = 0; i < abonnes.size(); i++) {
			if (name.getIdentite() == abonnes.get(i).getIdentite()) {
				System.out.println("Cet abonné existe déja dans la bibliothéque");
				return;
			}
		}
		abonnes.add(name);
	}
	public static void ajoutOuvrage(Ouvrage titre) {
		for (int i = 0; i < ouvrages.size(); i++) {
			if (titre.getTitre().equalsIgnoreCase(ouvrages.get(i).getTitre())) {
				System.out.println("Cet ouvrage existe déja dans la bibliothéque");
				return;
			}
		}
		ouvrages.add(titre);
	}
	public static void getOuvrage(String titre) {
		for (int i = 0; i < ouvrages.size(); i++) {
			if (titre.equalsIgnoreCase(ouvrages.get(i).getTitre())) {
				ouvrages.get(i).afficher();
			}
		}
	}
	public static void getAbonne(int num) {
		for (int i = 0; i < abonnes.size(); i++) {
			if (num == abonnes.get(i).getIdentite()) {
				abonnes.get(i).afficher();
			}
		}
	}
	


	

	/*


	public static void ajoutAbonne(Abonne name) {
		for (int i = 0; i < abonnes.size(); i++) {
			if (name.getNumeroIdentite() == abonnes.get(i).getNumeroIdentite()) {
				System.out.println("Cet abonné existe déja dans la bibliothéque");
				return;
			}
		}
		abonnes.add(name);
	}
	
	public static void ajoutOuvrage(Ouvrage titre) {
		for (int i = 0; i < ouvrages.size(); i++) {
			if (titre.getTitre().equalsIgnoreCase(ouvrages.get(i).getTitre())) {
				System.out.println("Cet ouvrage existe déja dans la bibliothéque");
				return;
			}
		}
		ouvrages.add(titre);
	}
	
	public static void getOuvrage(String titre) {
		for (int i = 0; i < ouvrages.size(); i++) {
			if (titre.equalsIgnoreCase(ouvrages.get(i).getTitre())) {
				ouvrages.get(i).afficher();
			}
		}
	}
	public static void getAbonne(int num) {
		for (int i = 0; i < abonnes.size(); i++) {
			if (num == abonnes.get(i).getNumeroIdentite()) {
				abonnes.get(i).afficher();
			}
		}
	}
	
	public static void updateBiblio() {
		for (int i = 0; i < ouvrages.size(); i++) {
			for (int j = 0; j < abonnes.size(); j++) {
				if (ouvrages.get(i).getTitre().equalsIgnoreCase(abonnes.get(j).getOuvragePris())) {
					ouvrages.get(i).setLibre(false);
				}
			}
		}

	}*/
	}
