package dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import classes.Allergie;
import classes.Personne;
import classes.Preference;
import classes.Sondage;

public interface PersonneDAO {
	
	public Personne createPersonne(Personne personne) throws IOException;
	public Personne findPersonneById(String email); 
	public Personne updatePersonne(Personne personne) throws IOException, EntityNotFoundException;
	public List<Personne> getAll();
	public List<Personne> findByPreferenceNom(String preferenceNom);
	public List<Personne> findByAllergieNom(String allergieNom);
	public Allergie addAllergie(String personneEmail, Allergie a) throws IOException ;
	public Preference addPreference(String personneEmail, Preference p) throws IOException ;
	public Personne registerPersonne(Personne personne) throws IOException;
	public List<Sondage> findCreatedSondageOnDate(String date, String personneEmail);
	public List<Sondage> findParticipationsOnDate(String date, String personneEmail);
	public List<Sondage> findParticipations(String personneEmail);
	
}
