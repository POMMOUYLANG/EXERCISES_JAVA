package Homework.Homework11.ORM_Class;

import java.sql.SQLException;
import java.sql.Statement;

import Homework.Homework11.Models_classes.City;
import Homework.Homework11.Models_classes.Country;

public class CityORM extends ORM<City> {

    public CityORM() {
        super();
        tableName = "cities";
    }

    @Override
    public City add(City t) {
        try (var stmt = connection.createStatement()) {
            var sql = "INSERT INTO " + tableName + " VALUES(NULL, '" + t.getCity() + "', " + t.getCountry().getId() + ", '" + t.getUcity() + "')";
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
        CityORM cityORM = new CityORM();
        City city = new City(0, "Phnom Penh", country, "Phnom Penh_2");
        cityORM.add(city);
        System.out.println("Id: " + city.getId() + "; City: " + city.getCity() + "; Country: " + city.getCountry().getCountry() + "; Ucity: " + city.getUcity());
    }
}