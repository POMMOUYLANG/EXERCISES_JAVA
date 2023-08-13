package Homework.Homework11.ORM_Class;

import Homework.Homework11.Models_classes.Country;

import java.sql.SQLException;
import java.sql.Statement;

public class CountryORM extends ORM<Country> {
    public CountryORM(){
        super();
        tableName = "countries";
    }

    @Override
    public Country add(Country t) throws SQLException {
        try (var stmt = connection.prepareStatement("INSERT INTO " + tableName + " (id, country) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, t.getId());
            stmt.setString(2, t.getCountry());
    
            stmt.executeUpdate();
            var rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                t.setId(rs.getInt(1));
            }
            return t;    //
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }    

    public static void main(String[] args) throws SQLException{
        CountryORM orm = new CountryORM();
        Country    c   = new Country(0, "France");

        orm.add(c);
        System.out.println("Id: " + c.getId() + "; Name: " + c.getCountry());
    }
}
