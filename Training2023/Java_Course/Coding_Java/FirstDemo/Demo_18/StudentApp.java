package FirstDemo.Demo_18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public interface StudentApp {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Lang", 25),
            new Student("Dara", 30),
            new Student("Thida", 23),
            new Student("Mol", 31),
        };
        for(Student st : students){
            System.out.println(st);
        }
        System.out.println("=====================");
        Arrays.sort(students, new StudentSortAge());

    //     Comparator<Student> studentsortName = new Comparator<Student>(){
    //         @Override
    //         public int compare(Student o1, Student o2) {
    //         return o2.getName().compareTo(o1.getName()) ;
    //         } 
    //     };
    //     Arrays.sort(students, studentsortName);
        for(Student st : students){
            System.out.println(st);
        }
    }
}
