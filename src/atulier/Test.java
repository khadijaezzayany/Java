
package atulier;
import java.util.Scanner; 
public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print(" Quel est votre prénom ? ");  
		String str= sc.nextLine();              //reads string   
		System.out.print("Bonjour, "+str+"!");   
	

	}

}

