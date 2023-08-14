package FirstDemo.Demo_8;

public class constructorApp {
    public static void main(String[] args) {
        //className: constructor_1;
            // constructor_1 constructor = new constructor_1();
            
            // constructor_1 con = new constructor_1("Thida");
            // System.out.println("Name : " + con.getName());
            // System.out.println("Name : " + con.getAge());
        
            
        //className: classBook;

            //no-arg constructor
            // classBook book = new classBook();
            //parameterized constructor
            //classBook book = new classBook("English");
            
            //default constructor
            classBook book = new classBook();
            book.setTitle("Romantic");
            System.out.println(book.toString());

    }
}
