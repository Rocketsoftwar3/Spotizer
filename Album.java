package Spotizer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;

public class Album {
	private ArrayList<Titres> listeTitres;
	private ArrayList<String> genres;
	private Artiste artiste;
	private Groupe groupe;
	private String nom;
	private ImageIcon visuel;
	private LocalDate dateDeSortie;
	
	public Album(ArrayList<Titres> listeTitres,Artiste artiste,String nom,ImageIcon visuel,ArrayList<String> genres) {
		//Un artiste crée un album
		this.listeTitres=listeTitres;
		this.artiste=artiste;
		this.genres=genres;
		this.nom=nom;
		this.visuel=visuel;
	}
	
	public Album(ArrayList<Titres> listeTitres,Groupe groupe,String nom,ImageIcon visuel,ArrayList<String> genres) {
		//Un groupe crée un album
		this.listeTitres=listeTitres;
		this.genres=genres;
		this.groupe=groupe;
		this.nom=nom;
		this.visuel=visuel;
	}
	
	public ArrayList<Titres> getListeTitres() {
		return this.listeTitres;
	}
	
	public Artiste getArtiste() {
		return this.artiste;
	}
	
	public Groupe getGroupe() {
		return this.groupe;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public ImageIcon getVisuel() {
		return this.visuel;
	}
	
	public LocalDate getDate() {
		return this.dateDeSortie;
	}
	
	public void addTitres(Titres titre) {
		listeTitres.add(titre);		
	}
	public void removeTitre(Titres titre) {
		listeTitres.remove(titre);
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setArtiste(Artiste artiste) {
		this.artiste=artiste;
	}
	public void setVisuel(ImageIcon visuel) {
		this.visuel=visuel;
	}

	
	
	
	

}
