package FirstDemo.Demo_8;

public class BookService {
    //bookUtils util = new bookUtils();

    public Book[] createBooks(int n){
        Book[] books = new Book[n];
        for(int i=0; i<n; i++){
            books[i] = createBook();
        }
        return books;
    }

    public Book createBook(){
        //Please input title: Java
        //Please input author: Dara 
        //Please unput price: 25
        String title = bookUtils.geString("Please input title: ");
        String author = bookUtils.geString("Please input author: ");
        double price = bookUtils.getDouble("Please input price: ");
        Book book = new Book(title, author, price);
        return book;
    }

    public void print(Book[] books){
        for(Book book : books){
            System.out.println(book.toString());
        }
    }

    //Sorting array v1
    /*
    public void sortArray(Book[] books){
        for(int i=0; i<books.length; i++){
            for(int j=i+1; j<books.length; j++){
                if(books[i].getPrice() > books[j].getPrice() ){
                    Book tmp = books[i];
                    books[i] = books[j];
                    books[j] = tmp;
                }
            }
        }    
    }
    */
    //Find total price
    public double totalAmount(Book[] books){
        double total = 0;
        for(Book n : books){
            total += n.getPrice();
        }
        return total;
    }
}