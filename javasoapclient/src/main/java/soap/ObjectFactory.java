
package soap;

import javax.xml.namespace.QName;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _BookRoom_QNAME = new QName("http://soap/", "bookRoom");
    private static final QName _BookRoomResponse_QNAME = new QName("http://soap/", "bookRoomResponse");
    private static final QName _GetHotelRoom_QNAME = new QName("http://soap/", "getHotelRoom");
    private static final QName _GetHotelRoomResponse_QNAME = new QName("http://soap/", "getHotelRoomResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookRoom }
     * 
     * @return
     *     the new instance of {@link BookRoom }
     */
    public BookRoom createBookRoom() {
        return new BookRoom();
    }

    /**
     * Create an instance of {@link BookRoomResponse }
     * 
     * @return
     *     the new instance of {@link BookRoomResponse }
     */
    public BookRoomResponse createBookRoomResponse() {
        return new BookRoomResponse();
    }

    /**
     * Create an instance of {@link GetHotelRoom }
     * 
     * @return
     *     the new instance of {@link GetHotelRoom }
     */
    public GetHotelRoom createGetHotelRoom() {
        return new GetHotelRoom();
    }

    /**
     * Create an instance of {@link GetHotelRoomResponse }
     * 
     * @return
     *     the new instance of {@link GetHotelRoomResponse }
     */
    public GetHotelRoomResponse createGetHotelRoomResponse() {
        return new GetHotelRoomResponse();
    }

    /**
     * Create an instance of {@link HotelRoom }
     * 
     * @return
     *     the new instance of {@link HotelRoom }
     */
    public HotelRoom createHotelRoom() {
        return new HotelRoom();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookRoom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookRoom }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "bookRoom")
    public JAXBElement<BookRoom> createBookRoom(BookRoom value) {
        return new JAXBElement<>(_BookRoom_QNAME, BookRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookRoomResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookRoomResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "bookRoomResponse")
    public JAXBElement<BookRoomResponse> createBookRoomResponse(BookRoomResponse value) {
        return new JAXBElement<>(_BookRoomResponse_QNAME, BookRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelRoom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHotelRoom }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getHotelRoom")
    public JAXBElement<GetHotelRoom> createGetHotelRoom(GetHotelRoom value) {
        return new JAXBElement<>(_GetHotelRoom_QNAME, GetHotelRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelRoomResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHotelRoomResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getHotelRoomResponse")
    public JAXBElement<GetHotelRoomResponse> createGetHotelRoomResponse(GetHotelRoomResponse value) {
        return new JAXBElement<>(_GetHotelRoomResponse_QNAME, GetHotelRoomResponse.class, null, value);
    }

}
