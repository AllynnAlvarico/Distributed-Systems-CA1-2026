package alvarico.allynn.DSCA1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/test")
public class TestResource {
	
	@GET
	@Path("/test1")
	@Produces("text/plain")
	public String test() {
		return "REST API Test 1 Endpoint successfully working!";
	}
	
	@GET
	@Path("/test2")
	@Produces("text/plain")
	public String test2() {
		return "REST API Test 2 Endpoint successfully working!";
	}

}
