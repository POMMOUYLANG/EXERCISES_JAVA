package FirstDemo.Demo_9;

//Superclass
public class Animal {
    protected String name;

    void setName(String name){
        this.name = name;
    }

    protected void eat(){
        System.out.println("Animal eat pizza.");
    }

    void showName(){
            System.out.println("Animal name is : " +name);
    }

}
