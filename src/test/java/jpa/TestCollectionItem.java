package jpa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.collection.model.Etat;
import fr.collection.model.Item;
import fr.collection.model.Livre;

public class TestCollectionItem {

	EntityManagerFactory emf;
	EntityManager em;

	@Before
	public void setUp() {
		// Ouverture de la connexion
		emf = Persistence.createEntityManagerFactory("banque-app");
		em = emf.createEntityManager();
	}

	@Test
	public void test() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		Item item = new Livre("reference1", "chenille", "camille", "larousse", 1994, 15.5, "Paris",
				LocalDate.parse("24/05/1994", formatter), Etat.BON, 2.5);

		// assurance vie
		// On met à jour la bdd
		EntityTransaction transaction = this.em.getTransaction();
		transaction.begin();
		this.em.persist(item);

		transaction.commit();

	}

	@After
	public void cleanUp() {
		// Fermeture de la connexion
		em.close();
		emf.close();
	}

}
