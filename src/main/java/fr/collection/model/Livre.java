package fr.collection.model;

import java.time.LocalDate;

public class Livre extends Item {
	private String titre;
	private String auteur;
	private String editeur;
	private int anneeSortie;
	private double prixAchat;
	private String lieuAchat;
	private LocalDate dateAchat;
	private Etat etat;
	private double cote;

	public Livre(String titre, String auteur, String editeur, int annee, double prix, String lieu, LocalDate date,
			Etat etat, double cote) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
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

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
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
