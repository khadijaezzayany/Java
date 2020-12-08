package atulier;
import java.util.Scanner;
public class Tva {


	    public static double TTC(double x) {
	       
			return x + x*0.2;
	    }

	    public static double Remise(double x, double y) {
	        return x - x*y;
	    }

	    public static void main(String[] args) {
	        System.out.println("Veuillez saisir le montant :");

	        Scanner pr = new Scanner(System.in);
	        int price = pr.nextInt();

	        System.out.println("Voulez vous une remise ?");

	        String answer = pr.next();
	        
	        
	        //equalsIgnoreCase yes = YES. but equals NO

	        if(answer.equalsIgnoreCase("YES") || answer.equalsIgnoreCase("oui") ) {
	            System.out.println("Veuillez saisir le pourcentage de la remise");
	            float remise = pr.nextFloat();
//	            double remise = pr.nextDouble();
	            double apresRemise = Remise(price, remise);
	            System.out.println("le montant final est : " + TTC(apresRemise) + "TTC et le montant de la remise est " + (int) (remise*100) +"%" );
	        }else {
	            System.out.println(TTC(price));
	        }

	    pr.close();



	    }

	}

   


