package soap;

import javax.xml.ws.Endpoint;

public class launch {
    public static void main(String[] args) {
        Endpoint.publish(
          "http://localhost:8082/HotelReservationService", 
           new HotelReservationServiceImpl());
           System.out.println("Service published at: "  + "?wsdl");

    }
}