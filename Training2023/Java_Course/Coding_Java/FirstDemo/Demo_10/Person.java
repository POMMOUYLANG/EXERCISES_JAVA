package FirstDemo.Demo_10;

public class Person {
    protected String name;
    protected String gender;
    protected int age;
    protected String nationality = "Cambodia";

    // public Person(String name, String gender){
    //     // this.name = name;
    //     // this.gender = gender;
    //     this(name,gender,0);
    // }

    public Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    public final void showInfo(){
        System.out.println("This is from Person class.");
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
}
