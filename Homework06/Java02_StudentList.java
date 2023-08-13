package Homework.Homework06;
import java.util.ArrayList;
import java.util.Scanner;
public class Java02_StudentList {
    public static ArrayList<Java02_Student> list = new ArrayList<>();

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Java02_StudentList studentList = new Java02_StudentList();
        do {
            System.out.print("""
                    -------------------------------------
                                Student List
                    -------------------------------------
                    1. Add new student
                    2. List students
                    3. Remove student by name
                    4. Update student information by id
                    5. Quit
                    Choice: """);
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    studentList.addStudent(sc);
                    break;
                case 2:
                    studentList.listStudent();
                    break;
                case 3:
                    studentList.removeStudent(sc);
                    break;
                case 4:
                    studentList.updateStudent(sc);
                    break;
                case 5:
                    System.out.println("Thanks so much!\nGood bye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }                
            
        }
        while(choice != 5); 
    }

    public void addStudent(Scanner sc) {
        System.out.print("How many student: ");
        int numStd = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<numStd; i++) {
            System.out.printf("Student #%d\n",i+1);
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter student ID: ");
            String id = sc.nextLine();
            System.out.print("Enter student age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter student major: ");
            String major = sc.nextLine();

            Java02_Student student = new Java02_Student(id, name, age, major);
            list.add(student);
        }
        System.out.println("Student added succesfully!");
    }

    public void listStudent() {
        System.out.printf("%-10s %-13s %-5s %-10s\n","ID","Name", "Age", "Major");
        System.out.println("-------------------------------------");
        if(list.isEmpty()) {
            System.out.println("No Information!!");
        }
        else {
            for(Java02_Student student : list) {
                System.out.printf("%-10s %-13s %-5s %-10s\n", student.getID(), student.getName(), student.getAge(), student.getMajor());
            }
        }
    }

    public void removeStudent(Scanner sc) {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        boolean found = false;
        for(Java02_Student student : list) {
            if(student.getName().equalsIgnoreCase(name)) {
                list.remove(student);
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Student removed successfully!");
        }
        else {
            System.out.println("Student is not found!");
        }
    }

    public void updateStudent(Scanner sc) {
        System.out.print("Enter student ID: ");
        String id = sc.nextLine();
        boolean found = false;
        for(Java02_Student student : list) {
            if(student.getID().equalsIgnoreCase(id)) {
                System.out.print("Update student name:");
                String name = sc.nextLine();
                student.setName(name);
                System.out.print("Update student age:");
                int age = sc.nextInt();
                sc.nextLine();
                student.setAge(age);
                System.out.print("Update student major: ");
                String major = sc.nextLine();
                student.setMajor(major);
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Student updated successfully!");
        }
        else {
            System.out.println("Student is not found!");
        }
    }
}
