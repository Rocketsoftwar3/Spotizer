package Spotizer;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Titres {
	private String titre;
	private Duration duree;
	private Album album;
	private LocalDate dateDeSortie;
	private ArrayList<String> genre;
	private Artiste artiste;
	private Groupe groupe;
	
	public Titres(String titre,ArrayList<String> genre,Artiste artiste,Duration duree) {
		//Un artiste crée un single
		this.titre=titre;

		this.genre=genre;
		this.artiste=artiste;
		this.duree=duree;
	}
	
	public Titres(String titre,ArrayList<String> genre,Groupe groupe,Duration duree) {
		//Un groupe crée un single
		this.titre=titre;

		this.genre=genre;
		this.groupe=groupe;
		this.duree=duree;
	}
	
	public Titres(String titre,ArrayList<String> genre,Artiste artiste,Album album,Duration duree) {
		//Un artiste crée un titre qui appartient à un album
		this.titre=titre;
		this.genre=genre;
		this.artiste=artiste;
		this.duree=duree;
	}
	
	public Titres(String titre,ArrayList<String> genre,Groupe groupe,Album album,Duration duree) {
		//Un groupe crée un titre qui appartient à un album
		this.titre=titre;
		this.genre=genre;
		this.groupe=groupe;
		this.duree=duree;
	}
	public String getTitre() {
		return this.titre;
	}
	public LocalDate getDate() {
		return this.dateDeSortie;
	}
	
	public ArrayList<String> getGenre(){
		return this.genre;
	}
	public Artiste getArtiste() {
		return this.artiste;
	}
	
	public Groupe getGroupe() {
		return this.groupe;
	}
	public Album getAlbum() {
		return this.album;
	}
	public Duration getDuree() {
		return this.duree;
	}
	
	public void setTitre() {
		this.titre=titre;
	}
	public void setGenre(ArrayList<String> genre) {
		this.genre=genre;
	}}


