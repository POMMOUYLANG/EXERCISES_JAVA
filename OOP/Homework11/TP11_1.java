package Homework.Homework11;
import java.sql.*;

public class TP11_1 {
    private static final String DB_URL = "jdbc:mysql://localhost:3307/Homework11";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "Pom@23042002";

    public static void main(String[] args){
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            createTables(connection);
            connection.close();
            System.out.println("Creste successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void createTables(Connection connection) throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            // Create countries table
            stmt.execute("CREATE TABLE IF NOT EXISTS countries (" + "id INT AUTO_INCREMENT PRIMARY KEY, " 
            + "country VARCHAR(50) NOT NULL" + ") ENGINE=InnoDB ");

            // Create cities table
            stmt.execute("CREATE TABLE IF NOT EXISTS cities ("+ 
            "id INT AUTO_INCREMENT PRIMARY KEY, "
            + "city VARCHAR(50) NOT NULL, "
            + "countryid INTEGER REFERENCES countries(id), "
            + "ucity VARCHAR(60) UNIQUE " +") ENGINE=InnoDB");

            // create hotels table 
            stmt.execute("CREATE TABLE IF NOT EXISTS hotels ("+
            "id INTEGER AUTO_INCREMENT PRIMARY KEY, "
            + "hotel VARCHAR(100) NOT NULL, "
            + "countryid INTEGER REFERENCES countries(id), "
            + "cityid INTEGER REFERENCES cities(id), "
            + "stars TINYINT CHECK (stars >= 0 AND stars <= 5), "
            + "cost DECIMAL(12, 2), "
            + "info TEXT" +") ENGINE=InnoDB");

            // create images table 
            stmt.execute("CREATE TABLE IF NOT EXISTS images ("+ 
            "id INTEGER AUTO_INCREMENT PRIMARY KEY, "
            + "hotelid INTEGER REFERENCES hotels(id), "
            + "imagepath VARCHAR(256) NOT NULL" +") ENGINE=InnoDB");

            // create roles table 
            stmt.execute("CREATE TABLE IF NOT EXISTS roles ("+
            "id INTEGER AUTO_INCREMENT PRIMARY KEY, "
            + "role VARCHAR(20) NOT NULL UNIQUE" +") ENGINE=InnoDB");
            
            // create users table
            stmt.execute("CREATE TABLE IF NOT EXISTS users (" +
            "id INT AUTO_INCREMENT PRIMARY KEY, " +
            "username VARCHAR(30) NOT NULL UNIQUE CHECK (LENGTH(username) >= 3), " +
            "pass VARCHAR(80) CHECK (LENGTH(pass) >= 3), " +
            "email VARCHAR(256), " +
            "roleid INTEGER NOT NULL REFERENCES roles(id), " +
            "discount TINYINT CHECK (discount >= 0 AND discount <= 100), " +
            "avatar VARCHAR(256)" +
            ") ENGINE=InnoDB");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
