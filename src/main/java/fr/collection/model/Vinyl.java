package fr.collection.model;

import java.time.LocalDate;

public class Vinyl extends Item {
	private String titre;
	private String auteur;
	private Format format;
	private int anneeSortie;
	private double prixAchat;
	private String lieuAchat;
	private LocalDate dateAchat;
	private Etat etat;
	private double cote;

	public Vinyl(String titre, String auteur, int annee, double prix, String lieu, LocalDate date, Etat etat,
			double cote, Format format) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.format = format;
		this.anneeSortie = annee;
		this.prixAchat = prix;
		this.lieuAchat = lieu;
		this.dateAchat = date;
		this.etat = etat;
		this.cote = cote;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public int getAnneeSortie() {
		return anneeSortie;
	}

	public void setAnneeSortie(int anneeSortie) {
		this.anneeSortie = anneeSortie;
	}

	public double getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public String getLieuAchat() {
		return lieuAchat;
	}

	public void setLieuAchat(String lieuAchat) {
		this.lieuAchat = lieuAchat;
	}

	public LocalDate getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}
}
