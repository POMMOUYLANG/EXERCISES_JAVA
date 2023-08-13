package Homework.Homework10s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

public class DataClass {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dataclass";
    private static final String DB_NAME = "date_db";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    public static void createDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {
            String createDBQuery = "CREATE DATABASE IF NOT EXISTS " + DB_NAME;
            stmt.executeUpdate(createDBQuery);
            System.out.println("Database created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        String fullDbUrl = DB_URL + DB_NAME;
        return DriverManager.getConnection(fullDbUrl, DB_USERNAME, DB_PASSWORD);
    }

    public int subtractDates(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        long diffInMillis = cal1.getTimeInMillis() - cal2.getTimeInMillis();
        int diffInDays = (int) (diffInMillis / (24 * 60 * 60 * 1000));

        saveOperationHistory(date1, date2, diffInDays, "Subtraction");

        return diffInDays;
    }

    public Date incrementDate(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);

        saveOperationHistory(date, cal.getTime(), days, "Increment");

        return cal.getTime();
    }

    private void saveOperationHistory(Date date1, Date date2, int diff, String operationType) {

        try (Connection connection = getConnection();
         Statement statement = connection.createStatement()) {
            String checkTableQuery = "SHOW TABLES LIKE 'operation_history'";
            boolean tableExists = false;
            
            try (ResultSet resultSet = statement.executeQuery(checkTableQuery)) {
                if (resultSet.next()) {
                    tableExists = true;
                }
            }
            
            if (!tableExists) {
                String createTableQuery = "CREATE TABLE operation_history (ID INT AUTO_INCREMENT PRIMARY KEY, date_start DATE, date_end DATE, n_days INT, operation_type VARCHAR(50), changed_date DATETIME)";
                statement.executeUpdate(createTableQuery);
                System.out.println("subtraction_history table created successfully.");
            } else {
                System.out.println("subtraction_history table already exists.");
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }

        try (Connection connection = getConnection()) {
            String query = "INSERT INTO operation_history (date_start, date_end, n_days, operation_type, changed_date) " +
                    "VALUES (?, ?, ?, ?, NOW())";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDate(1, new java.sql.Date(date1.getTime()));
            statement.setDate(2, new java.sql.Date(date2.getTime()));
            statement.setInt(3, diff);
            statement.setString(4, operationType);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


class Test {
    public static void main(String[] args) {
        System.out.println("hello");
        DataClass.createDatabase();  // Create the database if it doesn't exist

        DataClass dateUtil = new DataClass();

        Date date1 = getDate(2022, 0, 28);
        Date date2 = getDate(2022, 0, 31);
        int diffInDays = dateUtil.subtractDates(date1, date2);
        System.out.println("Number of days between the dates: " + diffInDays);

        Date date3 = getDate(2022, 0, 28);
        Date incrementedDate = dateUtil.incrementDate(date3, 3);
        System.out.println("Incremented date: " + incrementedDate);
    }

    private static Date getDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }
}
