package polymorphisme2;

public class Afficher {

	public static void main(String[] args) {

		Livre a = new Livre("ali","sbkjah",true,"aljlj");
		a.afficher();
		Video v = new Video("ali","sbkjah",true,"aljlj",102.867);
		v.afficher();
	}
}
