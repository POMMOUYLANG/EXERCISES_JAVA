package src;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Config.DatabaseConnection;

public class Ex02_ChangesLog {
    private static List<ChangeHistory> changeHistory = new ArrayList<>();

    public List<ChangeHistory> getChangeHistory() {
        return changeHistory;
    }

    public void setChangeHistory() {
        String sql = "Select * from date_operation";
        try (
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
        ) {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            while(rs.next()) {
                int id = rs.getInt(1);
                String date = rs.getString(2);
                Date startDate = dateFormat.parse(date);
                date = rs.getString(3);
                Date endDate = dateFormat.parse(date);
                int nDays = rs.getInt(4);
                String operationType = rs.getString(5);
                date = rs.getString(6);
                Date changeDate = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(date);
                changeHistory.add(new ChangeHistory(id, startDate, endDate, nDays, operationType, changeDate));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        String display = "";
        int startIndex = Math.max(changeHistory.size() - 5, 0);
        for (int i = startIndex; i < changeHistory.size(); i++) {
            ChangeHistory history = changeHistory.get(i);
            display += history.toString() + "\n";
        }
        return display;
    }

    public List<ChangeHistory> getChangesByDate(Date date) {
        List<ChangeHistory> result = new ArrayList<>();
        for (ChangeHistory history : changeHistory) {
            if (isSameDate(history.getChangeDate(), date)) {
                result.add(history);
            }
        }
        return result;
    }

    public List<ChangeHistory> getChangesByWeek(int weekOfYear) {
        List<ChangeHistory> result = new ArrayList<>();
        for (ChangeHistory history : changeHistory) {
            if (getWeekOfYear(history.getChangeDate()) == weekOfYear) {
                result.add(history);
            }
        }
        return result;
    }

    public List<ChangeHistory> getChangesByDateRange(Date startDate, Date endDate) {
        List<ChangeHistory> result = new ArrayList<>();
        for (ChangeHistory history : changeHistory) {
            if ((history.getStartDate().after(startDate) || isSameDate(history.getStartDate(), startDate))
                    && (history.getEndDate().before(endDate) || isSameDate(history.getEndDate(), endDate))) {
                result.add(history);
            }
        }
        return result;
    }

    public List<ChangeHistory> getAllChanges() {
        return changeHistory;
    }

    private boolean isSameDate(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
    }

    private int getWeekOfYear(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.WEEK_OF_YEAR);
    }

    public static void main(String[] args) {
        int choice = 0;
        Ex02_ChangesLog changesLog = new Ex02_ChangesLog();
        try (Scanner sc = new Scanner(System.in)) {
            changesLog.setChangeHistory();
            do {
                System.out.println("""
                        ------------------------ Changes Log ------------------
                        1 - List 5 last changes (toString)
                        2 - Listing changes by date
                        3 - Listing changes by week
                        4 - Listing changes by date range
                        5 - List all changes
                        0 - Exit
                        """);
                System.out.print("Choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice) {
                    case 0:
                        System.out.println("Thank you...");
                        break;
                    case 1:
                        System.out.println(changesLog.toString());
                        break;
                    case 2:
                        System.out.println("Insert Date:");
                        System.out.print("Year  : ");
                        int year = sc.nextInt();
                        System.out.print("Month : ");
                        int month = sc.nextInt() - 1;
                        System.out.print("Day   : ");
                        int day = sc.nextInt();
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(year, month, day);
                        Date date = calendar.getTime();
                        for(ChangeHistory op : changesLog.getChangesByDate(date)) {
                            System.out.println(op.toString());
                        }
                        break;
                    case 3:
                        System.out.print("Insert Week of YEAR: ");
                        int week = sc.nextInt();
                        
                        for(ChangeHistory op : changesLog.getChangesByWeek(week)) {
                            System.out.println(op.toString());
                        }
                        break;
                    case 4:
                        System.out.println("Insert Start Date:");
                        System.out.print("Year  : ");
                        year = sc.nextInt();
                        System.out.print("Month : ");
                        month = sc.nextInt() - 1;
                        System.out.print("Day   : ");
                        day = sc.nextInt();
                        calendar = Calendar.getInstance();
                        calendar.set(year, month, day);
                        Date date1 = calendar.getTime();
                        System.out.println("Insert End Date:");
                        System.out.print("Year  : ");
                        year = sc.nextInt();
                        System.out.print("Month : ");
                        month = sc.nextInt() - 1;
                        System.out.print("Day   : ");
                        day = sc.nextInt();
                        calendar = Calendar.getInstance();
                        calendar.set(year, month, day);
                        Date date2 = calendar.getTime();
                        for(ChangeHistory op : changesLog.getChangesByDateRange(date1, date2)) {
                            System.out.println(op.toString());
                        }
                        break;
                    case 5:
                        System.out.println("ID  StartDate  EndDate  NDays  Operation  ChangeDate");
                        for(ChangeHistory op : changesLog.getAllChanges()) {
                            System.out.println(op.toString());
                        }
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }

            }
            while(choice != 0);
        }
    }
    
}
class ChangeHistory {
    int id;
    Date startDate;
    Date endDate;
    int nDays;
    String operationType;
    Date changeDate;
    public ChangeHistory(int id, Date startDate, Date endDate, int nDays, String operationType,
            Date changeDate) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nDays = nDays;
        this.operationType = operationType;
        this.changeDate = changeDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public int getnDays() {
        return nDays;
    }
    public void setnDays(int nDays) {
        this.nDays = nDays;
    }
    public String getOperationType() {
        return operationType;
    }
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
    public Date getChangeDate() {
        return changeDate;
    }
    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    @Override
    public String toString() {
        return getId() + "\t" + (new SimpleDateFormat("yyyy-MM-dd")).format(getStartDate()) + "\t" + (new SimpleDateFormat("yyyy-MM-dd")).format(getEndDate()) + "\t" + getnDays() + "\t" + getOperationType() + "\t" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(getChangeDate());
    }
}