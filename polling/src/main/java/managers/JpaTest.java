package managers;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import classes.Personne;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();

		tx.begin();

		Personne p1 = new Personne();
		p1.setNom("Ako");
		p1.setPrenom("Jean-Samuel");
		p1.setEmail("samiako411@gmail.com");
		try {
			manager.persist(p1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}

}
