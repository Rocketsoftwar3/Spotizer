package Spotizer;

import java.util.ArrayList;

public class Groupe {
	private String nomGroupe;
	private ArrayList<Artiste> membres;
	
	public Groupe(String nomGroupe,ArrayList<Artiste> membres) {
		this.nomGroupe=nomGroupe;
		this.membres=membres;
	}
	
	public void setNomGroupe(String nom) {
		this.nomGroupe=nomGroupe;
	}
	
	public void addMembres(Artiste artiste) {
		membres.add(artiste);	}
	
	public void removeMembres(Artiste artiste) {
		membres.remove(artiste);}

}
