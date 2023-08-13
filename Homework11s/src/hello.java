package Homework.Homework11s.src;

import java.sql.Connection;
import java.sql.DriverManager;

public class hello {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/I3_gicb?user=root&password=Pom@23042002")) {
            System.out.println("Connect to DB");
        } catch (Exception e) {
           
        }
    }
}
