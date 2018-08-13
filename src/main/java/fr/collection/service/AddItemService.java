package fr.collection.service;

import java.time.LocalDate;
import java.util.Scanner;

import fr.collection.dao.ICollectionDao;
import fr.collection.model.Etat;
import fr.collection.model.Livre;

public class AddItemService extends MenuService {

	public void executeUC(Scanner sc, ICollectionDao memDao) {

		System.out.println("Entrez le type d'objet à ajouter");

		String type = sc.next().toUpperCase();

		if (type.equals("LIVRE")) {
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
			System.out.println("Entrez la date de l'achat");
			String date = sc.next().toUpperCase();
			System.out.println("Entrez l'état du livre");
			String etat = sc.next().toUpperCase();
			System.out.println("Entrez la côte du livre");
			String cote = sc.next().toUpperCase();
			new Livre(titre, auteur, editeur, Integer.parseInt(annee), Double.parseDouble(prix), lieu,
					LocalDate.parse(date), Etat.valueOf(etat), Double.parseDouble(cote));
			memDao.ajouterItem();
		}

	}

}
