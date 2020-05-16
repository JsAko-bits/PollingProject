package daoImpl;

import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import classes.Allergie;
import classes.Personne;
import classes.Preference;
import classes.Sondage;
import dao.PersonneDAO;
import managers.EntityManagerHelper;

public class PersonneDAOImpl implements PersonneDAO{

	private EntityManager manager;
	private EntityTransaction tx;

	
	public PersonneDAOImpl() {
		this.manager = EntityManagerHelper.getEntityManager();
		this.tx = manager.getTransaction();
	}
	
	
	@Override
	public Personne createPersonne(Personne personne) throws IOException {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		this.manager.persist(personne);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		return personne;

	}

	@Override
	public Personne findPersonneById(String email) {
		// TODO Auto-generated method stub
		return this.manager.find(Personne.class, email);
	}

	@Override
	public Personne updatePersonne(Personne personne) throws IOException, EntityNotFoundException {
		// TODO Auto-generated method stub
		EntityManagerHelper.beginTransaction();
		Personne dbPersonne = this.manager.find(Personne.class, personne.getEmail());
		if( dbPersonne  == null)
			throw new EntityNotFoundException("cannot find personne with email "+personne.getEmail());
		
		dbPersonne.setPrenom(personne.getPrenom());
		dbPersonne.setNom(personne.getNom());
		dbPersonne.setEmail(personne.getEmail());
		Personne result = this.manager.merge(dbPersonne);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		
		return result;

	}

	@Override
	public List<Personne> getAll() {
		// TODO Auto-generated method stub
		TypedQuery<Personne> query = this.manager.createNamedQuery("Personne.findAll", Personne.class);
		List<Personne> results = query.getResultList();
		return results;

	}

	@Override
	public List<Personne> findByPreferenceNom(String preferenceNom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> findByAllergieNom(String allergieNom) {
		// TODO Auto-generated method stub
		TypedQuery<Personne> query = this.manager.createNamedQuery("Personne.findByAllergie", Personne.class);
		query.setParameter("allergieNom", allergieNom);
		return query.getResultList();

	}

	@Override
	public Allergie addAllergie(String personneEmail, Allergie a) throws IOException {
		// TODO Auto-generated method stub
		Personne personne = this.manager.find(Personne.class, personneEmail);
		if(personne == null)
			throw new EntityNotFoundException();
		
		EntityManagerHelper.beginTransaction();
		personne.addAllergie(a);
		this.manager.persist(personne);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		
		return a;

	}

	@Override
	public Personne registerPersonne(Personne personne) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sondage> findCreatedSondageOnDate(String date, String personneEmail) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Sondage> findParticipationsOnDate(String date, String personneEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sondage> findParticipations(String personneEmail) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Preference addPreference(String personneEmail, Preference p) throws IOException {
		// TODO Auto-generated method stub
		Personne personne = this.manager.find(Personne.class, personneEmail);
		if(personne == null)
			throw new EntityNotFoundException();
		
		EntityManagerHelper.beginTransaction();
		personne.addPreference(p);
		this.manager.persist(personne);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		
		return p;
	}

}
