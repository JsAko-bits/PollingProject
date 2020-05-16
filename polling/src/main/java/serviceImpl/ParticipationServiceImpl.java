package serviceImpl;

import java.io.IOException;

import javax.ws.rs.core.Response;

import classes.Participation;
import service.ParticipationService;

public class ParticipationServiceImpl implements ParticipationService{

	@Override
	public Response create(Participation p) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response update(Participation p) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getById(int participationId) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findByPersonne(String personneEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findBySondage(int sondageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findByPersonneAndSondage(String email, int sondageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findPersonnesWithPerefernce(String prefNom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
