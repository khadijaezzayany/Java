package heritage3;

public class Afficher {

	public static void main(String[] args) {

		Personne first = new Personne("K"
				+ "hadija", "Ezzayany", "Hay farah", "Agadir",
				1997);
		System.out.println(first.toString());
		first.modifiePersonne("Hay salam","Safi");
		System.out.println(first.toString());
	}
	

}
