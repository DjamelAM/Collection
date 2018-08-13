package fr.collection.model;

import java.time.LocalDate;

public class JouetAncien extends Item {
	private String nom;
	private String fabricant;
	private String categorie;
	private int anneeSortie;
	private double prixAchat;
	private String lieuAchat;
	private LocalDate dateAchat;
	private Etat etat;
	private double cote;

	public JouetAncien(String nom, String fabricant, int annee, double prix, String lieu, LocalDate date, Etat etat,
			double cote, String categorie) {
		super();
		this.nom = nom;
		this.fabricant = fabricant;
		this.categorie = categorie;
		this.anneeSortie = annee;
		this.prixAchat = prix;
		this.lieuAchat = lieu;
		this.dateAchat = date;
		this.etat = etat;
		this.cote = cote;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFabricant() {
		return fabricant;
	}

	public void setFabricant(String fabricant) {
		this.fabricant = fabricant;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
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