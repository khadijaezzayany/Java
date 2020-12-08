package atulier;
import java.util.HashSet;
public class Hashset {

	public static void main(String[] args) {
	    HashSet<String> mois = new HashSet<String>();
		  mois.add("Janvier");
		  mois.add("Février");
		  mois.add("Mars");
		  mois.add("Avril");
		  mois.add("Mai");
		  mois.add("Juin");
		  mois.add("Juillet");
		  mois.add("Aout");
		  mois.add("Septembre");
		  mois.add("Octobre");
		  mois.add("Novembre");
		  mois.add("Décembre");
		  //ajout
		  mois.add("ALI");
	    System.out.println(mois);
	    System.out.println("\r");
	    
	    //Parcourir
	    for(String j : mois)
	    System.out.println(j);
	    System.out.println("\r");
	    //Obtenir le nombre d'éléments dans un ensemble de HashSet
	   System.out.println(mois.size());

	
		
		
		  }
			}


