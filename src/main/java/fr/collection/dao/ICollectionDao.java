package fr.collection.dao;

import java.util.List;

import fr.collection.model.Item;

public interface ICollectionDao {

	public void ajouterItem(Item item);

	public void supprimerItem(Item item);

	public void modifierItem(Item oldItem, Item newItem);

	public List<Item> listerItem();

	public double estimationCollection();

}
