package polymorphisme2;

public class Abonne extends Ouvrage{
	private int identite;
	private String nom;
	private int numéro;

	Abonne(String titre, String cetarioDate, boolean dispo) {
		super(titre, cetarioDate, dispo);
		// TODO Auto-generated constructor stub
	}

	@Override
	void afficher() {
		// TODO Auto-generated method stub
		
	}

	public int getIdentite() {
		return identite;
	}

	public void setIdentite(int identite) {
		this.identite = identite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNuméro() {
		return numéro;
	}

	public void setNuméro(int numéro) {
		this.numéro = numéro;
	}

}
