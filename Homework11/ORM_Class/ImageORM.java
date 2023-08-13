package Homework.Homework11.ORM_Class;

import java.sql.SQLException;
import java.sql.Statement;

import Homework.Homework11.Models_classes.City;
import Homework.Homework11.Models_classes.Country;
import Homework.Homework11.Models_classes.Hotel;
import Homework.Homework11.Models_classes.Image;

public class ImageORM extends ORM<Image> {

    public ImageORM() {
        super();
        tableName = "images";
    }

    @Override
    public Image add(Image t) {
        try (var stmt = connection.createStatement()) {
            var sql = "INSERT INTO " + tableName + " VALUES(NULL, " + t.getHotel().getId() + ", '" + t.getImagePath() + "')";
            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            var rs = stmt.getGeneratedKeys();
            rs.next();
            t.setId(rs.getInt(1));
            return t;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Country country = new Country(1, "Cambodia");
        City city = new City(1, "Phnom Penh", country, "Phnom Penh_1");
        Hotel hotel = new Hotel(1, "Raffles Hotel Le Royal", country, city, 5, 270.99, "Raffles Hotel Le Royal invites you to enjoy an unforgettable stay at its iconic luxury hotel just off Phnom Penh's main boulevard near foreign embassies.");
        ImageORM imageORM = new ImageORM();
        
        Image image = new Image(0, hotel, "images/raffles.png");
        imageORM.add(image);
        System.out.println("Id: " + image.getId() + "; Hotel ID: " + image.getHotel().getId() + "; Image Path: " + image.getImagePath());
    }
}

