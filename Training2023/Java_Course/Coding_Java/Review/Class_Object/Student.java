package Review.Class_Object;

public class Student {
    private String name;
    private String gender;
    private int age;

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }

    //getter
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
}
