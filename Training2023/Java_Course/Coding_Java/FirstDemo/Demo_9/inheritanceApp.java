package FirstDemo.Demo_9;

public class inheritanceApp {
    public static void main(String[] args) {

        //Class : Animal of superclass
        Animal animal = new Animal();
        // animal.name = "Coca";
        // System.out.println(animal.name);
        animal.eat();// animal.toString();  
        // animal.toString();  
        // animal.setName("Koko");
        // animal.showName();
        

        //Class : Dog of subclass
        Dog dog = new Dog();
        // dog.name = "Koko";
        // System.out.println(dog.name);
        // dog.eat();
        // dog.showinfo();
        // dog.setName("Kitty");
        // dog.showName();
        // dog.displayName();
        dog.eatAll();

    }
}
