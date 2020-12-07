package exercice6;


public class Account {
	private	String nom;
	private String adresse;
	private double solde;
	public void info(String nom,String adresse,double solde){
		this.nom=nom;
		this.adresse=adresse;
		this.solde=solde;
	}
	public void retirer(double m){
		if(this.solde>m){
			System.out.println("you can");
			double r =this.solde-m;
			System.out.println("rest for yourbalance is  : "+ r);
		}else{
			System.out.println("You can't !!");
		}
	}
	
	

}
