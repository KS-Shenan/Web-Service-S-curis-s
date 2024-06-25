package soap;

import soap.HotelRoom;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;

@WebService
public interface HotelReservationService {

    @WebMethod
    HotelRoom getHotelRoom(String type);

    @WebMethod
    boolean bookRoom(String type, Date arrival, Date departure);
}
