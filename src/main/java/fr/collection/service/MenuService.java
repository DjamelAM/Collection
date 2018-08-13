package fr.collection.service;

import java.util.Scanner;

import fr.collection.dao.ICollectionDao;

public abstract class MenuService {
	public abstract void executeUC(Scanner sc, ICollectionDao memDao);
}
