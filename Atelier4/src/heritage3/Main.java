package heritage3;

public class Main {

	public static void main(String[] args) {

		Secretaire first = new Secretaire("Khadija", "Ezzayany", "Hay farah",
				"Agadir", 1997, "876123716");
		first.ecrirePersonne();

		Enseignant second = new Enseignant("Ali", "Ezzayany", "Hay salam",
				"Casa", 2007, "Physic");
		second.ecrirePersonne();
		
		Etudiant thrid = new Etudiant("Tanim","Rafiq","Tamdid","Agadir",2000,"Dueg");
		thrid.ecrirePersonne();
	}

}
