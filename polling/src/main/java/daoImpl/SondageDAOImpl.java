package daoImpl;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import classes.Participation;
import classes.Personne;
import classes.Reunion;
import classes.Sondage;
import dao.SondageDAO;
import managers.EntityManagerHelper;

public class SondageDAOImpl implements SondageDAO{
	
	
	private EntityManager manager;
	private EntityTransaction tx;

	
	public SondageDAOImpl() {
		this.manager = EntityManagerHelper.getEntityManager();
		this.tx = manager.getTransaction();
	}

	@Override
	public Sondage create(Sondage s) throws IOException {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		this.manager.persist(s);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		return s;
	}

	@Override
	public Sondage update(Sondage s) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sondage getById(int sondageId) throws IOException {
		// TODO Auto-generated method stub
		return this.manager.find(Sondage.class, sondageId);
	}

	@Override
	public List<Sondage> getAll() {
		// TODO Auto-generated method stub
		TypedQuery<Sondage> query = this.manager.createNamedQuery("Sondage.findAll", Sondage.class);
		List<Sondage> results = query.getResultList();

		return results;
	}

	@Override
	public List<Sondage> findByPersonne(String personneEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sondage findByMeeting(int reunionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sondage> findByPersonneAndMeeting(int personneId, int reunionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> findPersonnesWithPerefernce(String prefNom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sondage> findByTheme(String theme) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public Reunion findBySondage(int sondageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Participation addParticipation(Participation p, int sondageId) {
		// TODO Auto-generated method stub
		Sondage s = this.manager.find(Sondage.class, sondageId);
		if(s == null)
			throw new EntityNotFoundException();
		
		EntityManagerHelper.beginTransaction();
		s.addParticipation(p);
		this.manager.persist(s);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		
		return p;
	}

}
