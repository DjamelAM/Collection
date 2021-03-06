package fr.collection.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
// @Table(name = "Livre")
public class Livre extends Item {
	@Column(name = "Titre")
	private String titre;

	@Column(name = "Auteur")
	private String auteur;

	@Column(name = "Editeur")
	private String editeur;

	public Livre(String reference, String titre, String auteur, String editeur, int annee, double prix, String lieu,
			LocalDate date, Etat etat, double cote) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;

		super.setReference(reference);
		super.setAnneeSortie(annee);
		super.setPrixAchat(prix);
		super.setLieuAchat(lieu);
		super.setDateAchat(date);
		super.setEtat(etat);
		super.setCote(cote);
	}

	public String getRef() {
		return this.getReference();
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

	// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

	@Override
	public String toString() {
		return "Livre [reference=" + super.getReference() + ", anneeSortie=" + super.getAnneeSortie() + ", prixAchat="
				+ super.getPrixAchat() + ", lieuAchat=" + super.getLieuAchat() + ", dateAchat=" + super.getDateAchat()
				+ ", etat=" + super.getEtat() + ", cote=" + super.getCote() + ", titre=" + titre + ", auteur=" + auteur
				+ ", editeur=" + editeur + "]";
	}
}
