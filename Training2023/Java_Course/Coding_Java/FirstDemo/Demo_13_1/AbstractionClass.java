package FirstDemo.Demo_13_1;

import FirstDemo.Demo_13.Cat;

public class AbstractionClass {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound(); 
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
    }
    
}
