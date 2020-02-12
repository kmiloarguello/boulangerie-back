package xyz.camiloarguello.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "boutiques")
public class Boutique {
    @Id
    private String id;
    private String name;
    private String street;
    private String postalcode;
    private int telephone;
    private String timetable;


    public Boutique(String id, String name, String street, String postalcode, int telephone, String timetable) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.postalcode = postalcode;
        this.telephone = telephone;
        this.timetable = timetable;
    }

    public Boutique(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }
}
