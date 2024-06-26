package infres.ws.rest.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Date {
    private String date;
    // Getters and setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}