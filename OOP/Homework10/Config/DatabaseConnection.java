package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnection {
    public static Connection getConnection() throws Exception{
        String userDir = System.getProperty("user.dir");
        userDir = userDir.concat("/TP10/Database/date.db");
        String url1 = "jdbc:sqlite:/";
        url1 = url1.concat(userDir).replace('\\', '/');
        return DriverManager.getConnection(url1);
    }

    public static Connection getOrderedConnection() throws Exception{
        String userDir = System.getProperty("user.dir");
        userDir = userDir.concat("/TP10/Database/orderedrecod.db");
        String url1 = "jdbc:sqlite:/";
        url1 = url1.concat(userDir).replace('\\', '/');
        return DriverManager.getConnection(url1);
    }

    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getOrderedConnection()) {
            String sql = "select * from ordered_history";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
