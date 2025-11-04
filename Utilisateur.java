package Spotizer;

public class Utilisateur {
	private String nom;
	private String prenom;
	private int age;
	private String email;
	private boolean abonnement;
	private double solde;
	private double prixParCinqMinutes;
	
	public Utilisateur(String nom,String prenom,int age,String email,boolean abonnement) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.email=email;
		this.abonnement=abonnement;
		this.solde=5.0;
		if (this.abonnement==true) {
			this.prixParCinqMinutes=0.03;}
		else {
			this.prixParCinqMinutes=0.02;
		}
	}
	
	public void ecouterTitre(Titres titre) {
		double sum=titre.getDuree().toMinutes()*this.prixParCinqMinutes;
		this.solde-=sum;
		titre.getArtiste().addRevenu(0.66*sum);
	}

	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getEmail() {
		return this.email;
	}

	public boolean getAbonnement() {
		return this.abonnement;
	}
	
	public double getSolde() {
		return this.solde;
	}
	
	public void setNom(String nom) {
		this.nom=nom;;
	}
	
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setAbonnement(boolean abonnement) {
		this.abonnement=abonnement;;
	}
	
	public void setSolde(double solde) {
		this.solde=solde;
	}
	




	

	

}
