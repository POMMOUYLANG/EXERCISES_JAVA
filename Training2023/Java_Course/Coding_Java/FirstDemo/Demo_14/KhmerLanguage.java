package FirstDemo.Demo_14;

public class KhmerLanguage implements Language{

    @Override
    public void greeting() {
        System.out.println("Suo Sdey");
        
    };

    @Override
    public void introduce(String name) {
        System.out.println("My name is " + name);
        
    };
    
}
