package dao;

import java.io.IOException;
import java.util.List;

import classes.Participation;
import classes.Personne;
import classes.Reunion;
import classes.Sondage;

public interface SondageDAO {

	public Sondage create(Sondage s) throws IOException ;
	public Sondage update(Sondage s) throws IOException ;
	public Sondage getById(int sondageId) throws IOException ;
	public List<Sondage> getAll();
	public List<Sondage> findByPersonne(String personneEmail);
	public Sondage findByMeeting(int reunionId);
	public List<Sondage> findByPersonneAndMeeting(int personneId, int reunionId);
	public List<Personne> findPersonnesWithPerefernce(String prefNom);
	public List<Sondage> findByTheme(String theme);
	public Reunion findBySondage(int sondageId);
	public Participation addParticipation(Participation p, int sondageId);
}
