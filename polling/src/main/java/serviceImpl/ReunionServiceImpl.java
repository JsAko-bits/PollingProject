package serviceImpl;

import java.io.IOException;

import javax.ws.rs.core.Response;

import classes.Reunion;
import service.ReunionService;

public class ReunionServiceImpl implements ReunionService{

	@Override
	public Response create(Reunion r) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response update(Reunion r) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getById(int reunionId) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findByPersonne(int personneId) {
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

}
