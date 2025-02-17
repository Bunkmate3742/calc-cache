package org.acme.service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.acme.CalcAction;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@Path("/calculate")
@RegisterRestClient(configKey = "calc-service")
public interface CalculatorService {
    @Path("{numOne}/{action}/{numTwo}")
    @GET
    Double calculate(
            @PathParam("numOne") String numOne,
            @PathParam("action") CalcAction action,
            @PathParam("numTwo") String numTwo
    );
}
