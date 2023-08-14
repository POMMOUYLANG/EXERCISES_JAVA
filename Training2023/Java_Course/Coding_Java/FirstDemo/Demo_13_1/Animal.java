package FirstDemo.Demo_13_1;

public abstract class Animal {
    protected String name;
    protected int age;

    public void eat(){
        System.out.println("Animal can eat.");
    }

    public abstract void makeSound();
}
