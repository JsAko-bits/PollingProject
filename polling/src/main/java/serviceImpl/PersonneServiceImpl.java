package serviceImpl;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import classes.Allergie;
import classes.Personne;
import classes.Preference;
import classes.ResponseBuilder;
import dao.PersonneDAO;
import daoImpl.PersonneDAOImpl;
import service.PersonneService;

@Path("/personnes")
@Produces(MediaType.APPLICATION_JSON)

public class PersonneServiceImpl implements PersonneService{

	private PersonneDAO personneDAO;
	
	public PersonneServiceImpl() {
		// TODO Auto-generated constructor stub
		personneDAO = new PersonneDAOImpl();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public Response createPersonne(Personne personne) throws IOException {
		// TODO Auto-generated method stub
		try {
			Personne result = this.personneDAO.createPersonne(personne);
			return ResponseBuilder.buildResponse(result, "Cannot persist user");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseBuilder.buildResponse(null, "Cannot persist user - Cause : " + e.getMessage());
		}
	}

	@GET
	@Path("/{email}")
	@Override
	public Response findPersonneById(String email) {
		// TODO Auto-generated method stub
		try {
			Personne result = this.personneDAO.findPersonneById(email);
			return ResponseBuilder.buildResponse(result, "Cannot find user with id " + email);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseBuilder.buildResponse(null,
					"Cannot find user with id " + email + " - Cause : " + e.getMessage());
		}

	}

	@Override
	public Response updatePersonne(Personne personne) throws IOException, EntityNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@GET
	@Override
	public Response getAll() {
		// TODO Auto-generated method stub
		try {
			List<Personne> results = this.personneDAO.getAll();
			return ResponseBuilder.buildResponse(results, "Error ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseBuilder.buildResponse(null, "Cannot get people from database - Cause : " + e.getMessage());
		}

	}

	@GET
	@Path("/{preferenceNom}")
	@Override
	public Response findByPreferenceNom(String preferenceNom) {
		// TODO Auto-generated method stub
		try {
			List<Personne> results = this.personneDAO.findByPreferenceNom(preferenceNom);
			return ResponseBuilder.buildResponse(results, "Error ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseBuilder.buildResponse(null, "Cannot get people from database - Cause : " + e.getMessage());
		}

	}

	@GET
	@Path("/{allergieNom}")
	@Override
	public Response findByAllergieNom(String allergieNom) {
		// TODO Auto-generated method stub
		try {
			List<Personne> results = this.personneDAO.findByAllergieNom(allergieNom);
			return ResponseBuilder.buildResponse(results, "Error ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseBuilder.buildResponse(null, "Cannot get people from database - Cause : " + e.getMessage());
		}
	}

	@POST
	@Path("/{personneEmail}/add-allergie")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public Response addAllergie(String personneEmail, Allergie a) throws IOException {
		// TODO Auto-generated method stub
		try {
			Allergie results = this.personneDAO.addAllergie(personneEmail, a);
			return ResponseBuilder.buildResponse(results, "Error ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseBuilder.buildResponse(null, "Cannot get people from database - Cause : " + e.getMessage());
		}
	}

	@POST
	@Path("/{personneEmail}/add-preference")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public Response addPreference(String personneEmail, Preference p) throws IOException {
		// TODO Auto-generated method stub
		try {
			Preference results = this.personneDAO.addPreference(personneEmail, p);
			return ResponseBuilder.buildResponse(results, "Error ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseBuilder.buildResponse(null, "Cannot get people from database - Cause : " + e.getMessage());
		}

	}

	@Override
	public Response registerPersonne(Personne personne) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findCreatedSondageOnDate(String date, String personneEmail) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Response findParticipationsOnDate(String date, String personneEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response findParticipations(String personneEmail) {
		// TODO Auto-generated method stub
		return null;
	}

}
