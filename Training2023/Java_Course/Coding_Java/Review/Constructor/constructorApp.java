package Review.Constructor;

public class constructorApp{
    public static void main(String[] args) {
        //no-Aarg constructor
        constructor constru = new constructor();

        // parameterized constructor
        // constructor con = new constructor("Mouylang");

        // default constructor
        constructor con3 = new constructor();
        con3.setName("Khmer");
        System.out.println(con3.toString());
    }
}