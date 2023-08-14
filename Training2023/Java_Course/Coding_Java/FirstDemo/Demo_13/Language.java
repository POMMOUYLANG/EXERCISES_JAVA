package FirstDemo.Demo_13;

public abstract class Language {
    protected int year;

    abstract void display();
    
    public Language(){
        // year = 2023;
        this(2023);
    }
    public Language(int year){
        this.year = year;
    }

    void sayHello(){
         
    }

    void info(){
        // System.out.println("This is language class");
        System.out.println("This language was intented in " + year);
    }
}
