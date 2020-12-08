package atulier;
import java.util.Scanner;
public class Tva {

	
	static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        double     HT = 0, TVA = 0.2 , TTC = 0.0, r =0;


        System.out.println("le prix de produit (dh):");
        HT = reader.nextDouble();
        System.out.println("le pourcentage de remise :");
        r = reader.nextDouble();
        if (r == 0) {
            TTC = HT + (HT * TVA);
            System.out.println("TTC = " + TTC + "dh");
        }
        if(r > 0.0){
            r = HT * r;
            TTC = HT + (HT * TVA) - r;
            System.out.println("TTC = " + TTC + "dh");
        }
    }
}
