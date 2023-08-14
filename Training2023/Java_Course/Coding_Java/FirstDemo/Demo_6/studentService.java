package FirstDemo.Demo_6;

import java.util.Scanner;

public class studentService {
    //function set value
    public classStudent_1 createStudent(){

        Scanner sc = new Scanner(System.in);
            classStudent_1 stu = new classStudent_1();

            System.out.print("Name : ");
            String name = sc.next();
            stu.setName(name);

            System.out.print("Gender : ");
            stu.setGender(sc.next());

            System.out.print("Age : ");
            stu.setAge(sc.nextInt());

            return stu;
    }

    //Display All Student
    //Array
    public classStudent_1[] createStudentArray(int n){
        classStudent_1[] stuArray = new classStudent_1[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Student" +(i+1)+ ":");
            stuArray[i] = createStudent();
        }
        return stuArray;
    }
    //print array
    public void print(classStudent_1[] stu){
        for(classStudent_1 st : stu){
            System.out.println(st.toString());
            // System.out.println(st);
        }
    }

    //Sorting by name
    public void sortByName(classStudent_1[] stu){
        for(int i=0; i<stu.length; i++){
            for(int j=i+1; j<stu.length; j++){
                if(stu[i].getName().compareTo(stu[j].getName()) > 0){
                    classStudent_1 tmp = stu[i];
                    stu[i] = stu[j];
                    stu[j] = tmp; 
                }
            }
        }
    }
    //Sorting by Age
    public void sortByAge(classStudent_1[] stu){
        for(int i=0; i<stu.length; i++){
            for(int j=i+1; j<stu.length; j++){
                if(stu[i].getAge() > stu[j].getAge()){
                    classStudent_1 tmp = stu[i];
                    stu[i] = stu[j];
                    stu[j] = tmp; 
                }
            }
        }
    }

    //Find the oldest Student
    public classStudent_1 findOldStudent(classStudent_1[] stu){
        classStudent_1 maxAgeStudent = stu[0];
        for(int i=0; i<stu.length; i++){
            if(maxAgeStudent.getAge() < stu[i].getAge()){
                maxAgeStudent = stu[i];
            }
        }
        return maxAgeStudent;
    }
}
