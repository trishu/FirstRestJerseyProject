package sample.hello.resources;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import sample.hello.models.Person;

@Path("/hello")
public class HelloResource {

	private static Map<Integer,Person> persons = new HashMap<Integer,Person>();
	
	@GET
	@Path("/msg")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "Hello Jersey";
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addPerson(Person p) {
		
		persons.put(p.getId(), p);
		System.out.println("person added");
		return "done";
		//return Response.status(200).entity("Your order is in-progress").build();
	}
}
