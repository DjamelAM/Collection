package fr.collection.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
// @Table(name = "Jouet Ancien")
public class JouetAncien extends Item {
	@Column(name = "Nom")
	private String nom;

	@Column(name = "Fabricant")
	private String fabricant;

	@Column(name = "Categorie")
	private String categorie;

	public JouetAncien(String reference, String nom, String fabricant, int annee, double prix, String lieu,
			LocalDate date, Etat etat, double cote, String categorie) {
		super();
		this.nom = nom;
		this.fabricant = fabricant;
		this.categorie = categorie;
		super.setReference(reference);
		super.setAnneeSortie(annee);
		super.setPrixAchat(prix);
		super.setLieuAchat(lieu);
		super.setDateAchat(date);
		super.setEtat(etat);
		super.setCote(cote);
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
		return "Jouet Ancien [reference=" + super.getReference() + ", anneeSortie=" + super.getAnneeSortie()
				+ ", prixAchat=" + super.getPrixAchat() + ", lieuAchat=" + super.getLieuAchat() + ", dateAchat="
				+ super.getDateAchat().format(formatter) + ", etat=" + super.getEtat() + ", cote=" + super.getCote()
				+ ", Nom=" + nom + ", Fabricant=" + fabricant + ", Categorie=" + categorie + "]";
	}

}