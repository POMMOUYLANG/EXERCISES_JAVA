package FirstDemo.Demo_8;

public class constructor_1 {
    private String name;
    private int age;
    //No-Arg Constructor
    public constructor_1(){
        System.out.println("Student object is created.");
    }
    //Parameterized Constructor
    public constructor_1(String name){
        this.name = name;
        age = 23;
    }

    //Setter and Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
