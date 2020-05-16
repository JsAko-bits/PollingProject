package serviceImpl;

import java.io.IOException;

import javax.ws.rs.core.Response;

import classes.Participation;
import classes.Sondage;
import service.SondageService;

public class SondageServiceImpl implements SondageService{

	@Override
	public Response create(Sondage s) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response update(Sondage s) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getById(int sondageId) throws IOException {
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
	public Response findByMeeting(int reunionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findByPersonneAndMeeting(int personneId, int reunionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findPersonnesWithPerefernce(String prefNom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findByTheme(String theme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findBySondage(int sondageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response addParticipation(Participation p, int sondageId) {
		// TODO Auto-generated method stub
		return null;
	}

}
