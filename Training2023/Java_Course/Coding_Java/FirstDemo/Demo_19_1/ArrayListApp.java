package FirstDemo.Demo_19_1;

public class ArrayListApp {
    public static void main(String[] args) {

        School school = new School();
        // school.setName("Lang Java School");
        // System.out.println(school.getStudents());
        
    //Register Student
        Student st1 = new Student(1,"Lang", Gender.FEMALE);
        Student st2 = new Student(2,"Dara", Gender.MALE);
        Student st3 = new Student(3,"Thida", Gender.FEMALE);
        Student st4 = new Student(4,"Both", Gender.MALE);
        school.registerStudent(st1);
        school.registerStudent(st2);
        school.registerStudent(st3);
        school.registerStudent(st4);
        // // System.out.println(school.getStudents());
        school.displayStudent();
    //Remove Student
        // System.out.println("========================");
        // school.removeStudent(2);
        // school.displayStudent();
    //Display all Student
        // school.displayStudent();
    //Sorting all Studen
        // System.out.println("========================");
        // school.sortByName();
        // school.displayStudent();
    //Search all Studen
        // System.out.println("============Search Student============");
        // Student foundStudent = school.searchByName("Dara");
        // if(foundStudent != null){
        //     System.out.println(foundStudent.toString());
        // }else{
        //     System.out.println("Not Found");
        // }
    //Update all Studen
        System.out.println("============Update Student============");
        Student studentUpdate = new Student("DADA", Gender.FEMALE);
        school.updateStudent(4, studentUpdate);
        school.displayStudent();
    }
}
