package atulier;
import java.util.Scanner;
public class Prob {
	
	 

	public static void main(String[] args) {
		 Scanner prix = new Scanner(System.in);
		System.out.println("Combien avez-vous re�u d'argent (MAD) ?");
		 int mont = prix.nextInt();
		 
		 System.out.println("Vous avez re�u "+ mont + " MAD .");
	
		 int livre = mont * 3 /4;
			int rest = livre / 3;
			int rest2 = rest / 3;
			int rest3= rest % 66;
			int caf� =  rest2 % 10;
			int billets =  rest2 % 8;
			int carte =  rest2 % 10;
			int nbcaf� = rest2 / 10;
			int nbcarte= rest2 / 10;
			int nbbillets = rest2 / 8;
			
			
			int rose = caf� + billets + carte + rest3;

		  
		System.out.println("Livre et Fourniture" + livre +" MAD .");
		System.out.println("Il vous restera " + rest +" MAD .");
		System.out.println("Vous pouvez ensuite acheter : \r" + nbcaf� +" Caf�s \r" + nbcarte+ " Carte de recharge pr�payer \r"+
		nbbillets+" billets de TRAME");
		
		
		System.out.println("Il vous restera " + rose+"  MAD pour les roses blanches.");
		
		
		

		
	}

}
