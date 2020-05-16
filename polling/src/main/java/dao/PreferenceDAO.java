package dao;

import java.io.IOException;
import java.util.List;

import classes.Personne;
import classes.Preference;

public interface PreferenceDAO {

	public Preference create(Preference p) throws IOException ;
	public Preference getById(int preferenceId) throws IOException ;
	public List<Preference> getAll();
	public List<Preference> findByPersonne(String personneEmail);
	public List<Preference> findByMeeting(int reunionId);
	public List<Preference> findByPersonneAndMeeting(String personneEmail, int reunionId);
	public List<Personne> findPersonnesWithPerefernce(String prefNom);
	public List<Preference> findByNom(String nom);

}
