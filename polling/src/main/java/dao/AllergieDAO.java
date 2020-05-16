package dao;

import java.io.IOException;
import java.util.List;

import classes.Personne;
import classes.Allergie;

public interface AllergieDAO {

	public Allergie create(Allergie a) throws IOException ;
	public Allergie getById(int allergieId) throws IOException ;
	public List<Allergie> getAll();
	public List<Allergie> findByPersonne(int personneId);
	public List<Allergie> findByMeeting(int reunionId);
	public List<Allergie> findByPersonneAndMeeting(int personneId, int reunionId);
	public List<Allergie> findByNom(String nom);
}
