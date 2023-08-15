package FirstDemo.Demo_17;

    //Outer class
public class Computer { 
    private String model;

    public Computer(String model){  
        this.model = model;
    }

    public void display(){
        System.out.println("This is a Computer "+ model);
    }

    private void showinfo(){
        System.out.println("Computer info");
    }

    //inner class nad static
    static class Ram{
        private int memorySize;

        public void show(){
            // display();
        }


    }

    // Inner class and non-static
    protected class CPU{ 
        private int core;
        private String type;

        public CPU(int core, String type) {
            this.core = core;
            this.type = type;
        }    
        
        private void showinfo(){
            System.out.println("CPU info");
        }
                                                                                                                                                                    
        public void info(){
            System.out.println("Number of core = "+ core);
            System.out.println("CPU type = "+type);
            // display();
            Computer.this.showinfo(); // call outter class
        }
    }
}