package Homework.Homework10s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ChangesLog {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "date_db";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Pom@23042002";

    private static final int MAX_CHANGES = 5;

    private Connection getConnection() throws SQLException {
        String fullDbUrl = DB_URL + DB_NAME;
        return DriverManager.getConnection(fullDbUrl, DB_USERNAME, DB_PASSWORD);
    }

    public String getLastChanges() {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> changes = getLastNChanges(MAX_CHANGES);

        if (changes.isEmpty()) {
            stringBuilder.append("No changes found.");
        } else {
            for (String change : changes) {
                stringBuilder.append(change).append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public List<String> getLastNChanges(int n) {
        List<String> changes = new ArrayList<>();

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            String query = "SELECT * FROM operation_history ORDER BY changed_date DESC LIMIT " + n;
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String change = buildChangeString(resultSet);
                changes.add(change);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return changes;
    }

    public List<String> getChangesByDate(Date date) {
        List<String> changes = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM operation_history WHERE date_start = ?")) {
            statement.setDate(1, new java.sql.Date(date.getTime()));
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String change = buildChangeString(resultSet);
                changes.add(change);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return changes;
    }

    public List<String> getChangesByWeek(int year, int week) {
        List<String> changes = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.WEEK_OF_YEAR, week);

        // Find the start and end dates of the week
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        Date startDate = calendar.getTime();
        calendar.add(Calendar.DATE, 6);
        Date endDate = calendar.getTime();

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM operation_history WHERE date_start BETWEEN ? AND ?")) {
            statement.setDate(1, new java.sql.Date(startDate.getTime()));
            statement.setDate(2, new java.sql.Date(endDate.getTime()));
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String change = buildChangeString(resultSet);
                changes.add(change);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return changes;
    }

    public List<String> getChangesByDateRange(Date startDate, Date endDate) {
        List<String> changes = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM operation_history WHERE date_start BETWEEN ? AND ?")) {
            statement.setDate(1, new java.sql.Date(startDate.getTime()));
            statement.setDate(2, new java.sql.Date(endDate.getTime()));
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String change = buildChangeString(resultSet);
                changes.add(change);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return changes;
    }

    public List<String> getAllChanges() {
        List<String> changes = new ArrayList<>();

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            String query = "SELECT * FROM operation_history";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String change = buildChangeString(resultSet);
                changes.add(change);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return changes;
    }

    private String buildChangeString(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("ID");
        Date dateStart = resultSet.getDate("date_start");
        Date dateEnd = resultSet.getDate("date_end");
        int diff = resultSet.getInt("n_days");
        String operationType = resultSet.getString("operation_type");
        Date changedDate = resultSet.getTimestamp("changed_date");

        return id + ", " + dateStart + ", " + dateEnd + ", " + diff + ", " + operationType + ", " + changedDate;
    }
}
class Test1{
    public static void main(String[] args) {
        ChangesLog changesLog = new ChangesLog();

        System.out.println("Last changes:");
        System.out.println(changesLog.getLastChanges());

        System.out.println("Last 3 changes:");
        System.out.println(changesLog.getLastNChanges(3));

        System.out.println("Changes by date:");
        System.out.println(changesLog.getChangesByDate(new Date()));

        System.out.println("Changes by week:");
        System.out.println(changesLog.getChangesByWeek(2021, 1));

        System.out.println("Changes by date range:");
        System.out.println(changesLog.getChangesByDateRange(new Date(), new Date()));

        System.out.println("All changes:");
        System.out.println(changesLog.getAllChanges());
    }
}