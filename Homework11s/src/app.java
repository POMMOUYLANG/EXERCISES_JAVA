package Homework.Homework11s.src;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class app {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/I3_gicb?user=root&password=Pom@23042002")){
            System.out.println("Connect to DB");
            try (Statement stmt = con.createStatement()){
                System.out.println("DONE .\n Creating table `countries`...");
                stmt.execute("""
                    CREATE TABLE IF NOT EXISTS `countries` (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       country VARCHAR(50) UNIQUE NOT NULL
                    )
                """);
                System.out.println("DONE .\n Creating table `cities`...");
                stmt.execute("""
                    CREATE TABLE IF NOT EXISTS `cities` (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       city VARCHAR(50) NOT NULL,
                       countryid INT NOT NULL REFERENCES countries(id),
                       ucity VARCHAR(50) NOT NULL UNIQUE
                    )
                """);
                System.out.println("DONE .\n Creating table `hotel`...");
                stmt.execute("""
                    CREATE TABLE IF NOT EXISTS `hotel` (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        hotels VARCHAR(100) NOT NULL,
                        countryid INT NOT NULL REFERENCES countries(id),
                        cityid INT NOT NULL REFERENCES countries(id),
                        cost decimal(12,2),
                        infor VARCHAR(50) NOT NULL
                    )
                """);
                System.out.println("DONE...");
            }catch (Exception e) {
            e.printStackTrace();
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
