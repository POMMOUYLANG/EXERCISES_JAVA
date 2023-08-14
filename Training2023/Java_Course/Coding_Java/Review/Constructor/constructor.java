package Review.Constructor;

public class constructor{
    String name;

    // no-arg constructor is not parameter
    public constructor(){
        
        System.out.println("I learned Constructor.");
    }

    // parameterized constructor
    public constructor(String name){
        System.out.println(name); 
    }

    
    @Override
    public String toString() {
        return "constructor [name=" + name + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
}