
import soap.HotelReservationService;
import soap.HotelReservationServiceImplService;
import java.util.Date;

public class soapclient {
    public static void main(String[] args) {
        HotelReservationServiceImplService service = new HotelReservationServiceImplService();
        HotelReservationService port = service.getHotelReservationServiceImplPort();

        // Appel des méthodes du service
        // Note: Adjust date creation as per your need
        Date arrivalDate = new Date(); // replace with actual date
        Date departureDate = new Date(); // replace with actual date

        System.out.println(port.getHotelRoom("basique").getPrice());
        System.out.println(port.bookRoom("haut", arrivalDate, departureDate));
    }
}
