package FirstDemo.Demo_6;

public class studentApp {
    public static void main(String[] args) {
        //one person
        studentService stuService = new studentService();

        // classStudent_1 stu = stuService.createStudent();
        // System.out.println(stu.getName()+" "+ stu.getGender()+" "+stu.getAge()+" ");
        
        //more person
        int numberOfStudent = 3;
        classStudent_1[] studentArray =  stuService.createStudentArray(numberOfStudent);
        // for(int i=0; i<numberOfStudent; i++){
        //     System.out.println("=> "+studentArray[i].getName()+" "+ studentArray[i].getGender()+" "+studentArray[i].getAge()+" ");
        //     // System.out.println(studentArray[i].toString()); 
        // }

        stuService.print(studentArray);

        // stuService.sortByName(studentArray);
        // stuService.sortByAge(studentArray);
        // System.out.println("After sorting.");
        // stuService.print(studentArray);
            System.out.println("================= OldestStudent");
        classStudent_1 oldStudent =  stuService.findOldStudent(studentArray);
        System.out.println(oldStudent.toString());
        // System.out.println(oldStudent.getName());
            
    }
}
