package classes;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ResponseBuilder {
	
	
	public static Response buildResponse(Object notNUllObject, String errorMessage) {
		try {
			if(notNUllObject == null) { 
		    	return Response.ok(new classes.ResponseEntity(errorMessage, true)).build();
		    }
		    //String json = //convert entity to json
		    return Response.ok(notNUllObject, MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	    
	}


}
