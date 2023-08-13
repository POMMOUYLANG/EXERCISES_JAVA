package Homework.Homework11.ORM_Class;
import java.sql.SQLException;
import java.sql.Statement;

import Homework.Homework11.Models_classes.City;
import Homework.Homework11.Models_classes.Country;
import Homework.Homework11.Models_classes.Hotel;

public class HotelORM extends ORM<Hotel> {

    public HotelORM() {
        super();
        tableName = "hotels";
    }

    @Override
    public Hotel add(Hotel t) {
        try (var stmt = connection.createStatement()) {
            var sql = "INSERT INTO " + tableName + " VALUES(NULL, '" + t.getHotel() + "', " + t.getCountry().getId() + ", " +
                      t.getCity().getId() + ", " + t.getStars() + ", " + t.getCost() + ", '" + t.getInfo() + "')";
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
        HotelORM hotelORM = new HotelORM();

        Hotel hotel = new Hotel(0, "Raffles Hotel Le Royal", country, city, 5, 270.99, "Raffles Hotel Le Royal invites you to enjoy an unforgettable stay at its iconic luxury hotel just off Phnom Penhs main boulevard near foreign embassies.");
        hotelORM.add(hotel);
        System.out.println("Id: " + hotel.getId() + "; Hotel: " + hotel.getHotel() + "; Country: " + hotel.getCountry().getCountry() +
                           "; City: " + hotel.getCity().getCity() + "; Stars: " + hotel.getStars() + "; Cost: " + hotel.getCost() +
                           "; Info: " + hotel.getInfo());
    }
}
