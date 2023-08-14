package FirstDemo.Demo_13;

public class KhmerLanguage extends Language{

    public KhmerLanguage(){
        super(900);
    }

    // abstract String Hello();

    void display(){
        System.out.println("THis is display method");
    }

    @Override
    void sayHello() {
        System.out.println("Suo Sdey");
    }

    
}
