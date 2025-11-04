package Spotizer;

import java.util.ArrayList;

public class Artiste extends Utilisateur {
	private String nomArtiste;
	private double revenu;
	private String biographie;
	private ArrayList<Titres> listeTitres;
	
	public Artiste(String nom,String prenom,int age,String email,boolean abonnement,String nomArtiste,String biographie) {
		super(nom,prenom,age,email,abonnement);
		this.nomArtiste=nomArtiste;
		this.biographie=biographie;
		this.revenu=0;
		this.listeTitres=listeTitres;
	}

	public void addRevenu(double revenu) {
		this.revenu+=revenu;
		
	}
	

}
