package jpa;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.collection.model.Etat;
import fr.collection.model.Livre;

public class TestCollectionItem {

	EntityManagerFactory emf;
	EntityManager em;

	@Before
	public void setUp() {
		// Ouverture de la connexion

	}

	@Test
	public void test() {
		emf = Persistence.createEntityManagerFactory("Collection");
		em = emf.createEntityManager();
		// DateTimeFormatter formatter =
		// DateTimeFormatter.ofPattern("d/MM/yyyy");

		Livre item = new Livre("reference1", "chenille", "camille", "larousse", 1994, 15.5, "Paris", LocalDate.now(),
				Etat.BON, 2.5);

		// ITEM.SETREFERENCE("REF1");
		// ITEM.SET
		// assurance vie
		// On met à jour la bdd
		EntityTransaction transaction = this.em.getTransaction();
		transaction.begin();
		this.em.persist(item);

		transaction.commit();
		em.close();
		emf.close();
	}

	@After
	public void cleanUp() {
		// Fermeture de la connexion

	}

}
