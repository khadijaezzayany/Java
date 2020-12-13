package test;

import constructeur.Employe;

public class Test {

	public static void main(String[] args) {
		Employe a = new Employe("khadija","Ezzayany","Agadir",1997,2020);
		a.afficherInfosClient();
		System.out.println(a.calculerAge());
		
		Employe b = new Employe("Ali","Ezzayany","Agadir",2007,2020);
		b.afficherInfosClient();
		System.out.println(b.calculerAge());;
		
		Employe c = new Employe("Fatima","Ezzayany","Agadir",1999,2020);
		c.afficherInfosClient();
		System.out.println(c.calculerAge());
	}

	}

