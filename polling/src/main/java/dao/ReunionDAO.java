package dao;

import java.io.IOException;
import java.util.Set;

import classes.Personne;
import classes.Reunion;

public interface ReunionDAO {

	public Reunion create(Reunion r) throws IOException ;
	public Reunion update(Reunion r) throws IOException ;
	public Reunion getById(int reunionId) throws IOException ;
	public Set<Reunion> getAll();
	public Set<Reunion> findByPersonne(int personneId);
	public Set<Reunion> findByMeeting(int reunionId);
	public Set<Reunion> findByPersonneAndMeeting(int personneId, int reunionId);
	public Set<Personne> findPersonnesWithPerefernce(String prefNom);
	public Set<Reunion> findByTheme(String theme);
}
