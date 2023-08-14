package FirstDemo.Demo_16;

public class Rectangle {
    private double width;
    private double height;

    double calculateArea(){
        return width * height;
    }

    void setHeight(double h){
        if(h > 0){
           height = h; 
        }else{
            System.out.println("Height must be greater than 0");
        }
        
    }
    void setWidth(double w){
        if(w > 0){
           width = w; 
        }else{
            System.out.println("Height must be greater than 0");
        }
        
    }
}
