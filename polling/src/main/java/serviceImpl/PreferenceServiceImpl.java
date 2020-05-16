package serviceImpl;

import java.io.IOException;

import javax.ws.rs.core.Response;

import classes.Preference;
import service.PreferenceService;

public class PreferenceServiceImpl implements PreferenceService{

	@Override
	public Response create(Preference p) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getById(int preferenceId) throws IOException {
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
	public Response findByPersonneAndMeeting(String personneEmail, int reunionId) {
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
