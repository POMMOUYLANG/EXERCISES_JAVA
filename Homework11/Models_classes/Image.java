package Homework.Homework11.Models_classes;

public class Image {
    private int id;
    private Hotel hotel;
    private String imagepath;

    public Image(int id, Hotel hotel, String imagepath) {
        this.id = id;
        this.hotel = hotel;
        this.imagepath = imagepath;
    }

    public int getId() {
        return id;
    }   
    public void setId(int id) {
        this.id = id;
    }

    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getImagePath() {
        return imagepath;
    }
    public void setImagePath(String imagepath) {
        this.imagepath = imagepath;
    }
}
