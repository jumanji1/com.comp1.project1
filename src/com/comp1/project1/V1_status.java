package com.comp1.project1;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status/")
public class V1_status {
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
	return "<p>Java Web Service</p>";
	}

}
