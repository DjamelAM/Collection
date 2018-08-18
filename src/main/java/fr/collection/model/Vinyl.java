package fr.collection.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
// @Table(name = "Vinyl")
public class Vinyl extends Item {
	@Column(name = "Titre")
	private String titre;

	@Column(name = "Auteur")
	private String auteur;

	@Column(name = "Format")
	private Format format;

	public Vinyl(String reference, String titre, String auteur, int annee, double prix, String lieu, LocalDate date,
			Etat etat, double cote, Format format) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.format = format;
		super.setReference(reference);
		super.setAnneeSortie(annee);
		super.setPrixAchat(prix);
		super.setLieuAchat(lieu);
		super.setDateAchat(date);
		super.setEtat(etat);
		super.setCote(cote);
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
		return super.getAnneeSortie();
	}

	public void setAnneeSortie(int anneeSortie) {
		super.setAnneeSortie(anneeSortie);
	}

	public double getPrixAchat() {
		return super.getPrixAchat();
	}

	public void setPrixAchat(double prixAchat) {
		super.setPrixAchat(prixAchat);
	}

	public String getLieuAchat() {
		return super.getLieuAchat();
	}

	public void setLieuAchat(String lieuAchat) {
		super.setLieuAchat(lieuAchat);
	}

	public LocalDate getDateAchat() {
		return super.getDateAchat();
	}

	public void setDateAchat(LocalDate dateAchat) {
		super.setDateAchat(dateAchat);
	}

	public Etat getEtat() {
		return super.getEtat();
	}

	public void setEtat(Etat etat) {
		super.setEtat(etat);
	}

	public double getCote() {
		return super.getCote();
	}

	public void setCote(double cote) {
		super.setCote(cote);
	}

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

	@Override
	public String toString() {
		return "Vinyl [reference=" + super.getReference() + ", anneeSortie=" + super.getAnneeSortie() + ", prixAchat="
				+ super.getPrixAchat() + ", lieuAchat=" + super.getLieuAchat() + ", dateAchat="
				+ super.getDateAchat().format(formatter) + ", etat=" + super.getEtat() + ", cote=" + super.getCote()
				+ ", titre=" + titre + ", auteur=" + auteur + ", format=" + format + "]";
	}
}
