package FirstDemo.Demo_18;

public class AnonymousClassApp {

    //Anonymous Class
    Shape shape1 = new Shape(){
        public void draw(){
            System.out.println("Drawing something.");
        };
    };

    // void test(){
    //     shape1.draw();
    // }

    static Poligon p2 = new Poligon() {

        @Override
        public void info() {
            System.out.println("My Interface");
            t();
        }

        public void t(){
            System.out.println("Something ");
        }
        
    };
    public static void main(String[] args) {
        // Rectangle rectangle = new Rectangle();
        // rectangle.draw();
        // shape1.draw(); //have static od draw

        // AnonymousClassApp demo = new AnonymousClassApp();
        // demo.shape1.draw(); 
        p2.info();
    }
}
