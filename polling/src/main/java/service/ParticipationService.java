package service;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.core.Response;

import classes.Participation;
import classes.Personne;

public interface ParticipationService {

	public Response create(Participation p) throws IOException ;
	public Response update(Participation p) throws IOException ;
	public Response getById(int participationId) throws IOException ;
	public Response getAll();
	public Response findByPersonne(String personneEmail);
	public Response findBySondage(int sondageId);
	public Response findByPersonneAndSondage(String email, int sondageId);
	public Response findPersonnesWithPerefernce(String prefNom);
	public Response findByNom(String nom);
}
