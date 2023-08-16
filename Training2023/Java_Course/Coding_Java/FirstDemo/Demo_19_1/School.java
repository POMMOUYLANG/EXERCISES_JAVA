package FirstDemo.Demo_19_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class School {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    // public School() {
    //     students = new ArrayList<>();
    // }

    //Register Student
    public void registerStudent(Student student){
        students.add(student);
    }

    //Display Student
    public void displayStudent(){
        for(Student student : students){
            System.out.println("Name = %s , Gender = %s".formatted(student.getName(), student.getGender()));
        }
    }

    //Remove Student
    public void removeStudent(int studentID){
        /*
        for(Student student : students){
            if(student.getId() == studentID){
                students.remove(student);
            }
        }
         */
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if(student.getId() == studentID){
                iterator.remove();
            }
        }
    }
    
    //Sorting all Studen
    public void sortByName(){
        Comparator<Student> sortName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2){
                return o1.getName().compareTo(o2.getName());
            }
        };
        students.sort(sortName);
    }

    //Search all Studen
    public Student searchByName(String name){
        for(Student stu : students){
            if(stu.getName().equals(name)){
                return stu;
            }
        }
        return null;
    }

    public Student searchByID(int ID){
        for(Student stu : students){
            if(stu.getId() == ID){
                return stu;
            }
        }
        return null;
    }

    //Update all Studen
    public void updateStudent(int studentID, Student newStudent){
        // for(Student student : students){
        //     if(student.getId() == studentID){
        //         student.setGender(newStudent.getGender());
        //         student.setName(newStudent.getName());
        //     }
        // }
        Student student = searchByID(studentID);
        if(student != null){
            student.setName(newStudent.getName());
            student.setGender(newStudent.getGender());
        }else{
            System.out.println("Student is not Found");
        }
    }










    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
