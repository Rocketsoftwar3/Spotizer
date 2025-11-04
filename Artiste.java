package Spotizer;

import java.util.ArrayList;

public class Artiste extends Utilisateur {
	private String nomArtiste;
	private double revenu;
	private ArrayList<Titres> listeTitres;
	
	public Artiste(String nom,String prenom,int age,String email,boolean abonnement,String nomArtiste) {
		super(nom,prenom,age,email,abonnement);
		this.nomArtiste=nomArtiste;
		this.revenu=0;
		this.listeTitres=listeTitres;
	}
	

}
