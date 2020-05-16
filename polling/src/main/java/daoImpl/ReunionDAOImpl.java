package daoImpl;

import java.io.IOException;
import java.util.Set;

import classes.Personne;
import classes.Reunion;
import dao.ReunionDAO;

public class ReunionDAOImpl implements ReunionDAO{

	@Override
	public Reunion create(Reunion r) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reunion update(Reunion r) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reunion getById(int reunionId) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Reunion> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Reunion> findByPersonne(int personneId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Reunion> findByMeeting(int reunionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Reunion> findByPersonneAndMeeting(int personneId, int reunionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Personne> findPersonnesWithPerefernce(String prefNom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Reunion> findByTheme(String theme) {
		// TODO Auto-generated method stub
		return null;
	}

}
