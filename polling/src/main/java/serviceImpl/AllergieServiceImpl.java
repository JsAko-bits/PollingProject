package serviceImpl;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import classes.Allergie;
import classes.Personne;
import classes.ResponseBuilder;
import dao.AllergieDAO;
import daoImpl.AllergieDAOImpl;
import service.AllergieService;


@Path("/allergies")
@Produces(MediaType.APPLICATION_JSON)
public class AllergieServiceImpl implements AllergieService{

	
	private AllergieDAO allergieDAO;
	
	public AllergieServiceImpl() {
		this.allergieDAO = new AllergieDAOImpl();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public Response create(Allergie a) throws IOException {
		// TODO Auto-generated method stub
		try {
			Allergie result = this.allergieDAO.create(a);
			return ResponseBuilder.buildResponse(result, "Cannot persist allergie");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseBuilder.buildResponse(null, "Cannot persist allergie - Cause : " + e.getMessage());
		}
	}

	@GET
	@Path("/{allergieId}")
	@Override
	public Response getById(int allergieId) throws IOException {
		// TODO Auto-generated method stub
		try {
			Allergie result = this.allergieDAO.getById(allergieId);
			return ResponseBuilder.buildResponse(result, "Cannot find allergie with id " + allergieId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseBuilder.buildResponse(null,
					"Cannot find user with id " + allergieId + " - Cause : " + e.getMessage());
		}

	}

	@GET
	@Override
	public Response getAll() {
		// TODO Auto-generated method stub
		try {
			List<Allergie> results = this.allergieDAO.getAll();
			return ResponseBuilder.buildResponse(results, "Error ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseBuilder.buildResponse(null, "Cannot get allergies from database - Cause : " + e.getMessage());
		}
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
	public Response findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
