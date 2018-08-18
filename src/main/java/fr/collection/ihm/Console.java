package fr.collection.ihm;

import java.util.Scanner;

import fr.collection.dao.CollectionConsoleDao;
import fr.collection.service.AddItemService;
import fr.collection.service.DeleteItemService;
import fr.collection.service.FindAllItemService;
import fr.collection.service.MenuService;
import fr.collection.service.UpdateItemService;

public class Console {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		CollectionConsoleDao memDao = new CollectionConsoleDao();
		MenuService service = null;

		while (a != 99) {

			System.out.println("-----Menu Collection-----");
			System.out.println("1.Ajouter un article à la collection");
			System.out.println("2.Inventaire de la collection");
			System.out.println("3.Estimation de la collection");
			System.out.println("4.Modifier un article de la collection");
			System.out.println("5.Supprimer un article de la collection");
			System.out.println("99.Quitter");

			a = sc.nextInt();
			switch (a) {
			case 1:
				service = new AddItemService();
				service.executeUC(sc, memDao);
				break;

			case 2:
				service = new FindAllItemService();
				service.executeUC(sc, memDao);
				break;
			case 4:
				service = new UpdateItemService();
				service.executeUC(sc, memDao);
				break;
			case 5:
				service = new DeleteItemService();
				service.executeUC(sc, memDao);
				break;
			case 99:
				System.out.println("Aurevoir :(");

				break;

			}
		}
	}
}
