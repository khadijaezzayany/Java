package atulier;
import java.util.ArrayList;
import java.util.Collections;
public class Coll1 {
  public static void main(String[] args) {
	  ArrayList<String> mois = new ArrayList<String>();
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
	  mois.set(7, "Août");
	  mois.add(0,"ali");
	  mois.remove(2);
    
    System.out.println(mois);
    System.out.println(mois.get(2).toString());
    System.out.println(mois.get(5).toString());

  
    System.out.println(mois.get(7).toString());
    int ele = mois.indexOf("ali");
    System.out.println("\n The element ali is at index : " + ele);
    Collections.sort(mois);
    System.out.println(mois);
    
    ArrayList<String> mois2 = new ArrayList<String>();
    mois2.addAll(mois);
    System.out.println(mois2);
    
    Object mois3 = mois2.clone();
    System.out.println(mois3);
    }
  }

