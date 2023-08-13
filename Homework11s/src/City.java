package Homework.Homework11s.src;

public class City {
    private int id;
    private String city;
    private String country;
    private String ucity;
    public City(int id, String city, String country, String ucity) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.ucity = ucity;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getUcity() {
        return ucity;
    }
    public void setUcity(String ucity) {
        this.ucity = ucity;
    }
    
}
