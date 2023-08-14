package FirstDemo.Demo_5;

public class classStudent_2 {
    String name;
    String gender;
    private int age;

    //setter
    void setAge(int a){
        if(a >= 0){
            age = a;
        }
    }
    String toData(){
        return "Name = "+ name+" Gender = "+gender + " Age = "+age;
    }
}