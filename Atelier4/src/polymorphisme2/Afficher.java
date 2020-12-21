package polymorphisme2;

public class Afficher {

	private static final Bibliotheque Biblio = null;

	public static void main(String[] args) {

		Livre antigone = new Livre("Antigone", "1-1-1990", true, "unknown");
		Video matrix = new Video("Matrix", "2-2-1998", true, "unknown", 1.50);
		
		Abonne hamza = new Abonne("ehd", "jd", false, 1234, 5678, "Hamza", "Antigone"); 
		Abonne imad = new Abonne("jhd", "jne", false, 12345, 5678, "imad", "Matrix"); 
		
		Biblio.ajoutAbonne(hamza);
		Biblio.ajoutAbonne(imad);
		
		Biblio.ajoutOuvrage(antigone);
		Biblio.ajoutOuvrage(matrix);
		
		
		Biblio.getAbonne(1234);
		Biblio.getOuvrage("Matrix");
	}}

