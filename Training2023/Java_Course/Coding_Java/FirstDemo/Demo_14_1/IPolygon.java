package FirstDemo.Demo_14_1;

public interface IPolygon extends IArea, IPerimeter{
    
    public void draw();

    void version();

    default void infor(){
        System.out.println("Infor from Polygon.");


    }

    static void test(){
        System.out.println("Test.");
    }

    private void test2(){
        System.out.println("Test.");
    }
}
