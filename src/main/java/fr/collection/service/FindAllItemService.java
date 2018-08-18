package fr.collection.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.collection.dao.ICollectionDao;
import fr.collection.model.Item;

public class FindAllItemService extends MenuService {
	public void executeUC(Scanner sc, ICollectionDao memDao) {
		List<Item> collections = new ArrayList<Item>();
		collections = memDao.listerItem();

		for (int i = 0; i < collections.size(); i++) {
			System.out.println(collections.get(i));

		}

	}
}