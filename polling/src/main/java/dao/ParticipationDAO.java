package dao;

import java.io.IOException;
import java.util.List;

import classes.Personne;
import classes.Participation;

public interface ParticipationDAO {

	public Participation create(Participation p) throws IOException ;
	public Participation update(Participation p) throws IOException ;
	public Participation getById(int participationId) throws IOException ;
	public List<Participation> getAll();
	public List<Participation> findByPersonne(String personneEmail);
	public List<Participation> findBySondage(int sondageId);
	public List<Participation> findByPersonneAndSondage(String email, int sondageId);
	public List<Personne> findPersonnesWithPerefernce(String prefNom);
	public List<Participation> findByNom(String nom);
	
}
