package fr.collection.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import fr.collection.model.Item;

public class CollectionJpaDao implements ICollectionDao {
	EntityManagerFactory emf;
	EntityManager em;

	public void connexion() {

		emf = Persistence.createEntityManagerFactory("collection");
		em = emf.createEntityManager();

	}

	public void fermeture() {
		emf.close();
		em.close();
	}

	@Override
	public void ajouterItem(Item item) {
		connexion();
		EntityTransaction transaction = this.em.getTransaction();
		transaction.begin();
		this.em.persist(item);
		transaction.commit();
		fermeture();
	}

	@Override
	public void supprimerItem(Item item) {
		connexion();
		EntityTransaction transaction = this.em.getTransaction();
		transaction.begin();

		Query query = em.createQuery("DELETE FROM Collection c WHERE c.reference=:ref");
		query.setParameter("ref", item.getReference());

		query.executeUpdate();

		transaction.commit();

		fermeture();

	}

	@Override
	public void modifierItem(Item oldItem, Item newItem) {
		connexion();
		EntityTransaction transaction = this.em.getTransaction();
		transaction.begin();
		Query query = em.createQuery(
				"UPDATE Item i SET i.anneeSortie= :anneeSortie, i.prixAchat =:prixAchat, i.lieuAchat =:lieuAchat, i.dateAchat=:dateAchat, i.etat =:dateAchat, i.cote =:cote WHERE i.reference=:ref");
		query.setParameter("anneeSortie", newItem.getAnneeSortie());
		query.setParameter("prixAchat", newItem.getPrixAchat());
		query.setParameter("lieuAchat", newItem.getLieuAchat());
		query.setParameter("dateAchat", newItem.getDateAchat());
		query.setParameter("etat", newItem.getEtat());
		query.setParameter("cote", newItem.getCote());
		query.setParameter("ref", oldItem.getReference());

		query.executeUpdate();
		transaction.commit();

		fermeture();
	}

	@Override
	public List<Item> listerItem() {
		connexion();
		TypedQuery<Item> query = em.createQuery("SELECT p FROM Pizza p", Item.class);
		ArrayList<Item> items = (ArrayList<Item>) query.getResultList();
		fermeture();
		return items;
	}

	@Override
	public double estimationCollection() {
		// TODO Auto-generated method stub
		return 0;
	}

}
