package src;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import Config.DatabaseConnection;

public class Ex01_DateUtil {
    public void recordOperationHistory(Calendar dateStart, Calendar dateEnd, int nDays, String operationType) {
        Calendar now = Calendar.getInstance();
        String sql = "insert Into date_operation(date_start, date_end, n_day, operation_type, changed_date) Values (?, ?, ?, ?, ?)";
        try (
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ) {

            stmt.setString(1,formatDateToString(dateStart));
            stmt.setString(2, formatDateToString(dateEnd));
            stmt.setInt(3, nDays);
            stmt.setString(4, operationType);
            stmt.setString(5, (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(now.getTime()));
            int row = stmt.executeUpdate();
            if(row>0) {
                System.out.println("Operation history record succesfully...!");
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readHistoryOperation() {
        System.out.println("ID\t date_start\t date_end\t n_days\t operation_type\t changed_date\n");
        String sql = "Select * from date_operation";
        try (
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
        ) {
            while(rs.next()) {
                System.out.println(rs.getString(1) + "\t"+ rs.getString(2) + "\t"+ rs.getString(3)
                                    + "\t"+ rs.getString(4) + "\t"+ rs.getString(5) + "\t"+ rs.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dateSubstraction(Scanner sc) {
        Calendar dateStart = Calendar.getInstance();
        Calendar dateEnd = Calendar.getInstance();
        System.out.println("--------------- 1 - Date Substraction -----------------");
        System.out.println("Insert Start Date: ");
        System.out.print("Year  : ");
        int year = sc.nextInt();
        System.out.print("Month : ");
        int month = sc.nextInt() - 1;
        System.out.print("Day   : ");
        int day = sc.nextInt();
        dateStart.set(year, month, day);

        System.out.println("\nInsert End Date: ");
        System.out.print("Year  : ");
        year = sc.nextInt();
        System.out.print("Month : ");
        month = sc.nextInt() - 1;
        System.out.print("Day   : ");
        day = sc.nextInt();
        dateEnd.set(year, month, day);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Start Date: " + dateFormat.format(dateStart.getTime()));
        System.out.println("End Date: " + dateFormat.format(dateEnd.getTime()));

        int nDays = (int)((dateEnd.getTimeInMillis() - dateStart.getTimeInMillis()) / (24 * 60 * 60 * 1000));
        recordOperationHistory(dateStart, dateEnd, nDays, "Substraction");
    }

    public void dateIncrement(Scanner sc) {
        Calendar dateStart = Calendar.getInstance();
        Calendar dateEnd = Calendar.getInstance();
        System.out.println("--------------- 2 - Date Increasing -----------------");
        System.out.println("Insert Start Date: ");
        System.out.print("Year  : ");
        int year = sc.nextInt();
        System.out.print("Month : ");
        int month = sc.nextInt() - 1;
        System.out.print("Day   : ");
        int day = sc.nextInt();
        dateStart.set(year, month, day);

        System.out.print("\nInsert Number of Day: ");
        int nDays = sc.nextInt();

        dateEnd.setTime(dateStart.getTime());
        dateEnd.add(Calendar.DAY_OF_MONTH, nDays);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Start Date: " + dateFormat.format(dateStart.getTime()));
        System.out.println("End Date: " + dateFormat.format(dateEnd.getTime()));

        recordOperationHistory(dateStart, dateEnd, nDays, "Increment");
    }

    public String formatDateToString(Calendar date) {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        return formatDate.format(date.getTime());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex01_DateUtil dateUtil = new Ex01_DateUtil();
        int choice = 0;
        do{
            System.out.println("""
                    ------------------ Date Operation -----------------
                    1 - Date Substraction
                    2 - Date Increasing
                    3 - Read History
                    0 - Exit
                    """);
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 0:
                    System.out.println("Thanks you");
                    break;
                case 1:
                    dateUtil.dateSubstraction(sc);
                    break;
                case 2:
                    dateUtil.dateIncrement(sc);
                    break;
                case 3:
                    dateUtil.readHistoryOperation();
                    break;
                default :
                    System.out.println("Invalid input...");
                    break;
            }

        }while(choice != 0);

    }
}