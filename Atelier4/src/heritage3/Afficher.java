package heritage3;

public class Afficher {

	public static void main(String[] args) {

		Secretaire first = new Secretaire("khadija", "Ezzayany", "Hay farah", "Agadir", 1997,"8927387");
		System.out.println(first.toString());
		first.modifiePersonne("Hay salam","Safi");
		System.out.println(first.toString());
	}
	

}
