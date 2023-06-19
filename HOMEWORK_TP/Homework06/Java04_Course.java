package Homework.Homework06;
import java.util.ArrayList;
import java.util.Scanner;
public class Java04_Course {
    private String course;
    private String professor;
    public static ArrayList<Java04_Course> courses = new ArrayList<>();

    public Java04_Course() {}

    public Java04_Course(String course, String professor) {
        this.course = course;
        this.professor = professor;
    }

    
    public String getCourse() {
        return course;
    }
    
    public String getProfessor() {
        return professor;
    }
    
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Java04_Course ex4 = new Java04_Course();
        ex4.defaultCourses();
        do{
            System.out.print("""
                -------------------------------------
                             Courses
                -------------------------------------
                1. List all courses
                2. Find courses by name
                3. Add new course
                4. Quit
                Chooice: """);
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    ex4.listAllCourses();
                    break;
                case 2:
                    ex4.findCourse(sc);
                    break;
                    case 3:
                    ex4.addCourse(sc);
                    break;
                case 4:
                    System.out.println("Good bye...!");
                    break;
                default :
                    System.out.println("Invalid choice..., try again!");
                    break;
                }
            }
            while(choice != 4);
        }
        
        public void defaultCourses() {
            String course, professor;
            course = "Atomata Theory";
            professor = "VALY Dona";
            Java04_Course ex4 = new Java04_Course(course, professor);
            courses.add(ex4);
    
            course = "Object Oriented Programing";
            professor = "TAL Tonsreng"; 
            ex4 = new Java04_Course(course, professor);
            courses.add(ex4);
    
            course = "Web Desigh";
            professor = "CHUN Thavorac";
            ex4 = new Java04_Course(course, professor);
            courses.add(ex4);
    
            course = "Programing Environment";
            professor = "TAL Tonsreng";
            ex4 = new Java04_Course(course, professor);
            courses.add(ex4);

            course = "Theore Computer Science";
            professor = "KONG Phutpalla";
            ex4 = new Java04_Course(course, professor);
            courses.add(ex4);
        }
        
        public void listAllCourses() {
            System.out.println("\tCourse of GIC");
            System.out.println("------------------------------------------------");
        System.out.printf("%s - %-30s %-20s\n", "No", "Course", "Professor");
        System.out.println("------------------------------------------------");
        for(int i=0; i<courses.size(); i++) {
            int n = i+1;
            System.out.printf("%d - %-30s %-20s\n", n, courses.get(i).course, courses.get(i).professor );
        }
    }

    public void findCourse(Scanner sc) {
        boolean found = false;
        System.out.print("Inter course name: ");
        String subject = sc.nextLine();
        for(Java04_Course ex4 : courses) {
            if(ex4.getCourse().equalsIgnoreCase(subject)) {
                System.out.println("Course is found...:");
                System.out.println("------------------------------------------------");
                System.out.println(ex4.getCourse() + " by prof." + ex4.getProfessor());
                System.out.println("------------------------------------------------");
                
                found = true;
            }
        }

        if(!found) {
            System.out.println("Course is not found....! ");
        }

    } 

    public void addCourse(Scanner sc) {
        System.out.print("Input Course Name: ");
        String subject = sc.nextLine();
        System.out.print("Input Professor Name: ");
        String teacher = sc.nextLine();

        Java04_Course ex4 = new Java04_Course(subject, teacher);
        courses.add(ex4);
        System.out.println("Info save...!");
    }
}
