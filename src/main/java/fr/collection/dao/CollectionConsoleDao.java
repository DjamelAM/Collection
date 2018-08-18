package fr.collection.dao;

import java.util.ArrayList;
import java.util.List;

import fr.collection.model.Item;

public class CollectionConsoleDao implements ICollectionDao {

	List<Item> collections = new ArrayList<Item>();

	@Override
	public void ajouterItem(Item item) {
		collections.add(item);
	}

	@Override
	public void supprimerItem(Item item) {
		collections.remove(item);
	}

	@Override
	public void modifierItem(Item oldItem, Item newItem) {

		collections.remove(oldItem);
		collections.add(newItem);

	}

	@Override
	public List<Item> listerItem() {
		return collections;
	}

	@Override
	public double estimationCollection() {
		// TODO Auto-generated method stub
		return 0;
	}

}
