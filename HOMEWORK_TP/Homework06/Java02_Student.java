package Homework.Homework06;

public class Java02_Student {
    private String id;
    private String name;
    private int age;
    private String major;

    public Java02_Student(){}
    public Java02_Student(String id, String name, int age, String major){
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
