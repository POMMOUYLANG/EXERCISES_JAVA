package Review.Class_Object;

import java.util.Scanner;

public class StudentService {
    public Student createStudent(){ //function :  student = dataType; createStudent = functionName

        Student stu = new Student(); //Object

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Name: ");
        stu.setName(sc.next());

        System.out.print("Gender: ");
        stu.setGender(sc.next());

        System.out.print("Age: ");
        stu.setAge(sc.nextInt());

        return stu;
    }

    //More people of array
   public Student[] createStudentArray(int n){
        Student[] stuArray = new Student[n];
        for(int i=0; i<n; i++){
            stuArray[i] = createStudent();
        }
        return stuArray;
   }
}
