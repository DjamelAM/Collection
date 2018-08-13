package fr.collection.dao;

import java.util.List;

import fr.collection.model.Item;

public interface ICollectionDao {

	public void ajouterItem();

	public void supprimerIteam();

	public void modifierIte();

	public List<Item> listerItem();

	public double estimationCollection();

}
