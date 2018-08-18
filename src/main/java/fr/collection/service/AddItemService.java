package fr.collection.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import fr.collection.dao.ICollectionDao;
import fr.collection.model.Etat;
import fr.collection.model.Format;
import fr.collection.model.Livre;
import fr.collection.model.Vinyl;

public class AddItemService extends MenuService {

	public void executeUC(Scanner sc, ICollectionDao memDao) {

		System.out.println("Entrez le type d'objet à ajouter");

		String type = sc.next().toUpperCase();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		if (type.equals("LIVRE")) {
			System.out.println("Entrez la référence");
			String reference = sc.next().toUpperCase();
			System.out.println("Entrez le titre");
			String titre = sc.next().toUpperCase();
			System.out.println("Entrez le nom de l'auteur");
			String auteur = sc.next().toUpperCase();
			System.out.println("Entrez le nom de l'editeur");
			String editeur = sc.next().toUpperCase();
			System.out.println("Entrez l'année de sortie");
			String annee = sc.next();
			System.out.println("Entrez le prix à l'achat");
			String prix = sc.next();
			System.out.println("Entrez le le lieu de l'achat");
			String lieu = sc.next().toUpperCase();
			System.out.println("Entrez la date de l'achat sous la forme DD/MM/YY");
			String date = sc.next();
			System.out.println("Entrez l'état du livre : EXCELLENT, TRES BON, BON, MOYEN, ABIME");
			String etat = sc.next().toUpperCase().trim();
			System.out.println("Entrez la côte du livre");
			String cote = sc.next().toUpperCase();
			Livre livre = new Livre(reference, titre, auteur, editeur, Integer.parseInt(annee),
					Double.parseDouble(prix), lieu, LocalDate.parse(date, formatter), Etat.valueOf(etat),
					Double.parseDouble(cote));
			memDao.ajouterItem(livre);
		}

		if (type.equals("VINYL")) {
			System.out.println("Entrez la référence");
			String reference = sc.next().toUpperCase();
			System.out.println("Entrez le titre");
			String titre = sc.next().toUpperCase();
			System.out.println("Entrez le nom de l'auteur");
			String auteur = sc.next().toUpperCase();
			System.out.println("Entrez le format tours33 ou tours45");
			String format = sc.next().toUpperCase().trim();
			System.out.println("Entrez l'année de sortie");
			String annee = sc.next();
			System.out.println("Entrez le prix à l'achat");
			String prix = sc.next();
			System.out.println("Entrez le le lieu de l'achat");
			String lieu = sc.next().toUpperCase();
			System.out.println("Entrez la date de l'achat sous la forme DD/MM/YY");
			String date = sc.next();
			System.out.println("Entrez l'état du livre : EXCELLENT, TRES BON, BON, MOYEN, ABIME");
			String etat = sc.next().toUpperCase().trim();
			System.out.println("Entrez la côte du vinyl");
			String cote = sc.next().toUpperCase();
			Vinyl vinyl = new Vinyl(reference, titre, auteur, Integer.parseInt(annee), Double.parseDouble(prix), lieu,
					LocalDate.parse(date, formatter), Etat.valueOf(etat), Double.parseDouble(cote),
					Format.valueOf(format));
			memDao.ajouterItem(vinyl);
		}

	}

}
