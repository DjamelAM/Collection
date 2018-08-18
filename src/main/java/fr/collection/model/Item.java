package fr.collection.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public abstract class Item {
	@Id
	@Column(name = "References")
	private String reference;

	@Column(name = "Année de sortie")
	private int anneeSortie;

	@Column(name = "Prix d'achat")
	private double prixAchat;

	@Column(name = "Lieu d'achat")
	private String lieuAchat;

	@Column(name = "Date d'achat")
	private LocalDate dateAchat;

	@Enumerated(EnumType.STRING)
	// @Column(name = "Etat")
	private Etat etat;

	@Column(name = "Côte")
	private double cote;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
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

	@Override
	public String toString() {
		return "Item [reference=" + reference + ", anneeSortie=" + anneeSortie + ", prixAchat=" + prixAchat
				+ ", lieuAchat=" + lieuAchat + ", dateAchat=" + dateAchat + ", etat=" + etat + ", cote=" + cote + "]";
	}

}
