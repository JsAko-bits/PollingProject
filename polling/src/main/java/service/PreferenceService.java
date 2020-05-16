package service;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.core.Response;

import classes.Personne;
import classes.Preference;

public interface PreferenceService {

	public Response create(Preference p) throws IOException ;
	public Response getById(int preferenceId) throws IOException ;
	public Response getAll();
	public Response findByPersonne(String personneEmail);
	public Response findByMeeting(int reunionId);
	public Response findByPersonneAndMeeting(String personneEmail, int reunionId);
	public Response findPersonnesWithPerefernce(String prefNom);
	public Response findByNom(String nom);
}
