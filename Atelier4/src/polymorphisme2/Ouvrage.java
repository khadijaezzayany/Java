package polymorphisme2;

public abstract class Ouvrage {
	private String titre;
	private String cetarionDate;
	private boolean dispo;
	
	

	Ouvrage(String titre, String cetarioDate, boolean dispo) {
		this.titre = titre;
		this.cetarionDate = cetarioDate;
		this.dispo = dispo;

	}

	
	


	abstract void afficher();

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setCetarionDate(String cetarionDate) {
		this.cetarionDate = cetarionDate;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	public String getCetarionDate() {
		return cetarionDate;
	}

	public boolean isDispo() {
		return dispo;
	}

}
