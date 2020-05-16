package daoImpl;

import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import classes.Participation;
import classes.Personne;
import dao.ParticipationDAO;
import managers.EntityManagerHelper;

public class ParticipationDAOImpl implements ParticipationDAO{

	private EntityManager manager;
	private EntityTransaction tx;

	public ParticipationDAOImpl() {
		this.manager = EntityManagerHelper.getEntityManager();
		this.tx = manager.getTransaction();
	}

	@Override
	public Participation create(Participation p) throws IOException {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		this.manager.persist(p);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		return p;
	}

	@Override
	public Participation update(Participation p) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Participation getById(int participationId) throws IOException {
		// TODO Auto-generated method stub
		return this.manager.find(Participation.class, participationId);
	}

	@Override
	public List<Participation> getAll() {
		// TODO Auto-generated method stub
		TypedQuery<Participation> query = this.manager.createNamedQuery("Participation.findAll", Participation.class);
		List<Participation> results = query.getResultList();

		return results;
	}

	@Override
	public List<Participation> findByPersonne(String personneEmail) {
		// TODO Auto-generated method stub
		TypedQuery<Participation> query = this.manager.createNamedQuery("Participation.findByPersonne", Participation.class);
		query.setParameter("email", personneEmail);
		List<Participation> results = query.getResultList();

		return results;
	}

	@Override
	public List<Participation> findBySondage(int sondageId) {
		// TODO Auto-generated method stub
		TypedQuery<Participation> query = this.manager.createNamedQuery("Participation.findBySondage", Participation.class);
		query.setParameter("sondageId", sondageId);
		List<Participation> results = query.getResultList();

		return results;
	}

	@Override
	public List<Participation> findByPersonneAndSondage(String email, int sondageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> findPersonnesWithPerefernce(String prefNom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Participation> findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
