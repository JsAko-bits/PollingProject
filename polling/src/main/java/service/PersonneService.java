package service;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.ws.rs.core.Response;

import classes.Allergie;
import classes.Personne;
import classes.Preference;
import classes.Sondage;

public interface PersonneService {

	public Response createPersonne(Personne personne) throws IOException;
	public Response findPersonneById(String email); 
	public Response updatePersonne(Personne personne) throws IOException, EntityNotFoundException;
	public Response getAll();
	public Response findByPreferenceNom(String preferenceNom);
	public Response findByAllergieNom(String allergieNom);
	public Response addAllergie(String personneEmail, Allergie a) throws IOException ;
	public Response addPreference(String personneEmail, Preference p) throws IOException ;
	public Response registerPersonne(Personne personne) throws IOException;
	public Response findCreatedSondageOnDate(String date, String personneEmail);
	public Response findParticipationsOnDate(String date, String personneEmail);
	public Response findParticipations(String personneEmail);
}
