package daoImpl;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import classes.Preference;
import classes.Personne;
import classes.Preference;
import dao.PreferenceDAO;
import managers.EntityManagerHelper;

public class PreferenceDAOImpl implements PreferenceDAO{

	private EntityManager manager;
	private EntityTransaction tx;

	
	public PreferenceDAOImpl() {
		this.manager = EntityManagerHelper.getEntityManager();
		this.tx = manager.getTransaction();
	}
	
	@Override
	public Preference create(Preference p) throws IOException {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		this.manager.persist(p);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		return p;

	}

	@Override
	public Preference getById(int preferenceId) throws IOException {
		// TODO Auto-generated method stub
		return this.manager.find(Preference.class, preferenceId);
	}

	@Override
	public List<Preference> getAll() {
		// TODO Auto-generated method stub
		TypedQuery<Preference> query = this.manager.createNamedQuery("Preference.findAll", Preference.class);
		List<Preference> results = query.getResultList();
		
		return results;
	}

	@Override
	public List<Preference> findByPersonne(String personneEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Preference> findByMeeting(int reunionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Preference> findByPersonneAndMeeting(String personneEmail, int reunionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> findPersonnesWithPerefernce(String prefNom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Preference> findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
