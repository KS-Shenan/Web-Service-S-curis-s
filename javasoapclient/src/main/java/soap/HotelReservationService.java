
package soap;

import javax.xml.datatype.XMLGregorianCalendar;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "HotelReservationService", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HotelReservationService {


    /**
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookRoom", targetNamespace = "http://soap/", className = "soap.BookRoom")
    @ResponseWrapper(localName = "bookRoomResponse", targetNamespace = "http://soap/", className = "soap.BookRoomResponse")
    @Action(input = "http://soap/HotelReservationService/bookRoomRequest", output = "http://soap/HotelReservationService/bookRoomResponse")
    public boolean bookRoom(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        XMLGregorianCalendar arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        XMLGregorianCalendar arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns soap.HotelRoom
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHotelRoom", targetNamespace = "http://soap/", className = "soap.GetHotelRoom")
    @ResponseWrapper(localName = "getHotelRoomResponse", targetNamespace = "http://soap/", className = "soap.GetHotelRoomResponse")
    @Action(input = "http://soap/HotelReservationService/getHotelRoomRequest", output = "http://soap/HotelReservationService/getHotelRoomResponse")
    public HotelRoom getHotelRoom(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    public char[] bookRoom(String arg0, Date arrivalDate, Date departureDate);

}
