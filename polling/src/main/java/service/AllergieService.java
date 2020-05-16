package service;

import java.io.IOException;

import javax.ws.rs.core.Response;

import classes.Allergie;

public interface AllergieService {
	
	public Response create(Allergie a) throws IOException ;
	public Response getById(int allergieId) throws IOException ;
	public Response getAll();
	public Response findByPersonne(int personneId);
	public Response findByMeeting(int reunionId);
	public Response findByPersonneAndMeeting(int personneId, int reunionId);
	public Response findByNom(String nom);
	
}
