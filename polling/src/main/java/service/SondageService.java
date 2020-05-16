package service;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.core.Response;

import classes.Participation;
import classes.Personne;
import classes.Reunion;
import classes.Sondage;

public interface SondageService {
	
	public Response create(Sondage s) throws IOException ;
	public Response update(Sondage s) throws IOException ;
	public Response getById(int sondageId) throws IOException ;
	public Response getAll();
	public Response findByPersonne(String personneEmail);
	public Response findByMeeting(int reunionId);
	public Response findByPersonneAndMeeting(int personneId, int reunionId);
	public Response findPersonnesWithPerefernce(String prefNom);
	public Response findByTheme(String theme);
	public Response findBySondage(int sondageId);
	public Response addParticipation(Participation p, int sondageId);
	
}
