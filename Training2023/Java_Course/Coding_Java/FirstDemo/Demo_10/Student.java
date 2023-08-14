package FirstDemo.Demo_10;

public class Student extends Person{
    private int grade;

    public Student(){
        super("Dara", "Male", 21);
    } 

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
