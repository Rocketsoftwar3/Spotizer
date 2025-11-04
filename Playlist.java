package Spotizer;

import java.time.Duration;
import java.util.ArrayList;

public class Playlist {
	private ArrayList<Titres> listeTitres;
	private Utilisateur createur;
	private Duration duree;
	
	public Playlist(Utilisateur créateur) {
		this.listeTitres=new ArrayList<Titres>();
		for (Titres titre:listeTitres) {
			duree=titre.getDuree();
		}
	}

}
