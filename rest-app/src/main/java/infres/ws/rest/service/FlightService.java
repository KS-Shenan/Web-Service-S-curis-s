package infres.ws.rest.service;

import infres.ws.rest.dao.FlightDAO;
import infres.ws.rest.model.Flight;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/flights")
public class FlightService {
    private FlightDAO flightDAO = new FlightDAO();

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Flight> getFlights() {
        return flightDAO.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Flight getFlight(@PathParam("id") Long id) {
        return flightDAO.findById(id);
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Flight addFlight(Flight flight) {
        flightDAO.save(flight);
        return flight;
    }

    @DELETE
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteFlight(@PathParam("id") Long id) {
        flightDAO.deleteById(id);
    }
}