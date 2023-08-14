package Review.Class_Object;

public class StudentApp {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        //one person
        // Student stu = studentService.createStudent();
        // System.out.println(stu.getName()+", "+stu.getGender()+", "+stu.getAge()+" ");

        //more people
        int numberArray = 3;
        Student[] studentArray = studentService.createStudentArray(numberArray);
        for(int i=0; i<numberArray; i++){
            System.out.println(studentArray[i].getName()+" "+studentArray[i].getGender()+" "+studentArray[i].getAge()+" " );
        }

    }
}
