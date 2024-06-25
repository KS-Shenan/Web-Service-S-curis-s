package soap;

import soap.HotelRoom;
import soap.HotelReservationService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "soap.HotelReservationService")
public class HotelReservationServiceImpl implements HotelReservationService {

    @Override
    public HotelRoom getHotelRoom(String type) {
        // Implémentation statique pour le type de chambre et le prix
        switch (type.toLowerCase()) {
            case "basique":
                return new HotelRoom("Basique", 50.0);
            case "middle":
                return new HotelRoom("Middle", 100.0);
            case "haut":
                return new HotelRoom("Haut de gamme", 200.0);
            default:
                return new HotelRoom("Haut de gamme", 200.0);
        }
    }

    @Override
    @WebMethod
    public boolean bookRoom(String type, Date arrival, Date departure) {
        // Implémentation statique pour la réservation
        // Toujours retourner true comme confirmation de réservation
        return true;
    }
}
