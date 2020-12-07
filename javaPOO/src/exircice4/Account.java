package exircice4;

public class Account {
	String nom;
	String address;
	double solde;
	
	
	 public void displayBalanceInfo(String nom ,String address, double solde){
		 this.nom=nom;
		 this.address=address;
		 this.solde=solde;
		 System.out.println("Nom : " +nom+ "\rAddress : "+address +"\rSolde : "+solde+" $");
	 }
	
	 public void calculatingInterer(){
			this.solde=solde;
			double interet = 0.07 * solde;
			System.out.println("Interet est :" +  interet);
		}
	 
	public static void main(String[] args) {
	
		Account first = new Account();
		first.displayBalanceInfo("ali","ali",100);
		first.calculatingInterer(); 
		

	}

}
