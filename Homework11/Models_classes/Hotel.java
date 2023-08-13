package Homework.Homework11.Models_classes;

public class Hotel {
    private int id;
    private String hotel;
    private Country country;
    private City city;
    private int stars;
    private Double cost;
    private String info;

    public Hotel(int id, String hotel, Country country, City city, int stars, Double cost, String info) {
        this.id = id;
        this.hotel = hotel;
        this.country = country;
        this.city = city;
        this.stars = stars;
        this.cost = cost;
        this.info = info;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getHotel() {
        return hotel;
    }
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }

    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }

    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }   

}
