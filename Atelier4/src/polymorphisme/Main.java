package polymorphisme;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Employe e1 = new Employe("Ali", "Rafiq", "Hay salam", "casa", 2000, 465447);
		Employe e2 = new Employe("Ali", "Rafiq", "Hay salam", "casa", 2000, 465447);
		Employe e3 = new Employe("Ali", "Rafiq", "Hay salam", "casa", 2000, 465447);
		Employe e4 = new Employe("Ali", "Rafiq", "Hay salam", "casa", 2000, 465447);
		Employe e5 = new Employe("Ali", "Rafiq", "Hay salam", "casa", 2000, 465447);

		Chef c1 = new Chef("Adam", "rihani", "agndiz", "youssofia", 1999, "Sell");
		Chef c2 = new Chef("Adam", "rihani", "agndiz", "youssofia", 1999, "Sell");

		Directeur d1 = new Directeur("Sohaib", "Damani", "yah salam", "Agadir", 2001, "sell", "Ecom");

		ArrayList<Perssonne> table = new ArrayList<Perssonne>();
		table.add(e1);
		table.add(e2);
		table.add(e3);
		table.add(e4);
		table.add(e5);
		table.add(c1);
		table.add(c2);
		table.add(d1);

		for (int j = 0; j < table.size(); j++) {
			table.get(j).Afficher();
			
		}
	}

}
