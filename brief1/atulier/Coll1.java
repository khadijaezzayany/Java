
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
	  //Aout
	  mois.set(7, "Août");
	  //ajout dans 1er position
	  mois.add(0,"ali");
	  //supprimer 3 
	  mois.remove(2);
    
	  
	  //affichage list
	  for(int i = 0; i < mois.size(); i++){
		  System.out.println(mois.get(i));
	  }
    
	 
	  //la valeur de la 3 lign
	  System.out.println("\r");
	  System.out.println(mois.get(2));
	  System.out.println("\r");
   
	  //la valeur d'index 5
	  System.out.println(mois.get(5));
	  System.out.println("\r");
	  
	  //Parcourir list
	  for(String j : mois)
		  System.out.println(j);
	  //-1  si la liste ne contient pas le element
	  if(mois.indexOf("ali") != -1){
		  System.out.println("\r oui");
	  }
	  
	  //Trier cette liste 
	  Collections.sort(mois);
	  System.out.println(mois);
	  System.out.println("\r");
	
	  //Copier cette liste dans une autre
	  ArrayList<String> mois2 = new ArrayList<String>();
	    mois2.addAll(mois);
	    System.out.println(mois2);
	    
	    //Clone
	    System.out.println("\r");
	    ArrayList newArrayList = (ArrayList) mois2.clone();
	    //12.	Tester cette liste est vide ou non
	    System.out.println(newArrayList);

  /*
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
    */
    }
  }

