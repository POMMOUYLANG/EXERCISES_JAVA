package FirstDemo.Demo_6;

public class classStudent_1 {
    private String name;
    private String gender;
    private int age;

    public String toString(){
        return "Name: "+name+" Gender: "+" Age: "+age;
    }

    // Setter
    public void setName(String n){
        name = n;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age  = age;
    }

    //Getter
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
