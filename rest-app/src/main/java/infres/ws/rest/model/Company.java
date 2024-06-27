package infres.ws.rest.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Company {
    private String airline;
    // Getters and setters
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}