package FirstDemo.Demo_9;

//Subclass
public class Dog extends Animal{

    void displayName(){
        System.out.println("Dog name is = " +name);
    }

    void showinfo(){
        System.out.println("This a dog.");
    }

    // protected void eat(){
    //     System.out.println("Dog eat dog's food.");
    // }

    @Override
    void showName() {
        System.out.println("This dog is named : "+name);
    }
    
    @Override
    void setName(String name) {
        this.name = name + " (From Dog class) ";
    }

    void eatAll(){
        super.eat();
        System.out.println("Eat called from super class");
        this.eat();
    }
}
