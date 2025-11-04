package Spotizer;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Playlist {
	private ArrayList<Titres> listeTitres;
	private Utilisateur createur;
	private Duration duree;
	private LocalDate dateDeCreation;
	
	public Playlist(Utilisateur créateur) {
		this.listeTitres=new ArrayList<Titres>();
		for (Titres titre:listeTitres) {
			duree.plus(titre.getDuree());
		}
	}
	
	public ArrayList<Titres> getPlayList(){
		return this.listeTitres;
	}
	
	public Utilisateur getCreateur() {
		return this.createur;
	}
	
	public Duration getDureePlayList() {
		return this.duree;
		
	}
	public LocalDate getDateDeCreation() {
		return this.dateDeCreation;
	}
	
	public void addTitreToPlaylist(Titres titre) {
		if (listeTitres.contains(titre)==false) {
			listeTitres.add(titre);
			duree.plus(titre.getDuree());}
		else {
			System.out.println("La chanson est déjà dans la playlist");
		}
	}
	public void removeTitreFromPlaylist(Titres titre) {
		listeTitres.remove(titre);
	}
	

}
