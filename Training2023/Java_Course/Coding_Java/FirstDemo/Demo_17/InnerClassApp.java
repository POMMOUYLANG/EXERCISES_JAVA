package FirstDemo.Demo_17;

import FirstDemo.Demo_17.Computer.Ram;

public class InnerClassApp {
    public static    void main(String[] args) {
        //outer class
        Computer com1 = new Computer("DELL");
        // com1.display();
        //inner class
        Computer.CPU cpu1 = com1.new CPU(4, "MD");
        cpu1.info();
        // cpu1.showinfo();
        
        Computer.Ram ram1 = new Ram();
        
    }
}
