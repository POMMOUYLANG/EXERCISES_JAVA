package FirstDemo.Demo_13;

public class AbstractionApp {
    public static void main(String[] args) {
        // Language la = new Language();
        KhmerLanguage KL = new KhmerLanguage(); 
        // KL.display();
        // KL.info();
        KL.sayHello();
        
        ThiaLanguage TL = new ThiaLanguage();
        TL.sayHello();
        
    }
}
