package infres.ws.rest.service;


import infres.ws.rest.model.Hotel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/hotels")
public class HotelService {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Hotel> getHotels() {
        List<Hotel> hotels = new ArrayList<>();
        
        return hotels;
    }

    @GET
    @Path("/{hotelType}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Hotel getHotel(@PathParam("hotelType") String hotelType) {
        Hotel hotel = new infres.ws.rest.model.Hotel();
        
        return hotel;
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Hotel addHotel(Hotel hotel) {
        // Add logic to add a hotel
        return hotel;
    }

    @DELETE
    @Path("/{hotelType}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteHotel(@PathParam("hotelType") String hotelType) {
       
    }
}