package atulier;

public class Fun7 {

	public static void main(String[] args) {
		
fun7("Homme",18);
fun7("Femme",16);
	}
	public static void fun7(String genre,int age){
	
		if(age >=18){
			System.out.println("Vous �tes un "+ genre+" et vous �tes majeur");
		}
		if(age < 18){
			System.out.println("Vous �tes un "+ genre+" et vous �tes mineur");
		}
	}
	}


