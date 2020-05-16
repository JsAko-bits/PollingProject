package daoImpl;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import classes.Allergie;
import classes.Personne;
import dao.AllergieDAO;
import managers.EntityManagerHelper;

public class AllergieDAOImpl implements AllergieDAO{
	
	private EntityManager manager;
	private EntityTransaction tx;

	
	public AllergieDAOImpl() {
		this.manager = EntityManagerHelper.getEntityManager();
		this.tx = manager.getTransaction();
	}

	@Override
	public Allergie create(Allergie a) throws IOException {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		this.manager.persist(a);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		return a;
	}

	@Override
	public Allergie getById(int allergieId) throws IOException {
		// TODO Auto-generated method stub
		return this.manager.find(Allergie.class, allergieId);
	}

	@Override
	public List<Allergie> getAll() {
		// TODO Auto-generated method stub
		TypedQuery<Allergie> query = this.manager.createNamedQuery("Allergie.findAll", Allergie.class);
		List<Allergie> results = query.getResultList();
		
		return results;
	}

	@Override
	public List<Allergie> findByPersonne(int personneId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Allergie> findByMeeting(int reunionId) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Allergie> findByPersonneAndMeeting(int personneId, int reunionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Allergie> findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
