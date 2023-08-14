package FirstDemo.Demo_11;

public class Student {
    private String name;
    private Gender gender;
    private Grade grade;

    static int numberOfStudent;

    public Student(String name, Gender gender, Grade grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", genden=" + gender + ", age=" + grade.getValue()+"] " + numberOfStudent;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Gender getGenden() {
        return gender;
    }
    public void setGenden(Gender genden) {
        this.gender = genden;
    }
    public Grade getAge() {
        return grade;
    }
    public void setAge(Grade age) {
        this.grade = age;
    }
    
    public static void print(){
        System.out.println("Name = "+numberOfStudent);
    }
}
