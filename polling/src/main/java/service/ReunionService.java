package service;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.core.Response;

import classes.Personne;
import classes.Reunion;

public interface ReunionService {

	public Response create(Reunion r) throws IOException ;
	public Response update(Reunion r) throws IOException ;
	public Response getById(int reunionId) throws IOException ;
	public Response getAll();
	public Response findByPersonne(int personneId);
	public Response findByMeeting(int reunionId);
	public Response findByPersonneAndMeeting(int personneId, int reunionId);
	public Response findPersonnesWithPerefernce(String prefNom);
	public Response findByTheme(String theme);
}
