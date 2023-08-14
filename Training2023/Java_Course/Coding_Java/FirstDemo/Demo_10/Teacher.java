package FirstDemo.Demo_10;

public class Teacher extends Person{
    private double salary;
    private String nationality = "Thia";
    final int HOUR = 30 ; 

    public Teacher(){ 
        super("Lang", "Female", 21);
        this.salary = 100;
        // HOUR = 60;
        
    }

    public void displaynationality(){
        // System.out.println(nationality);
        System.out.println(super.nationality);
    }

    // public String info(){
    //     return "name = "+name + ", gender = "+gender+", age = "+age+ ", salary = "+salary;
    // }
    
    // @Override
    // public String toString() {
    //     // return "Teacher [salary=" + salary + "]";
    //     return super.toString() + ", salary = "+salary;
    // }

    

    public double getSalary() {
        return salary;
    }

    @Override
    public void showInfo() {
        System.out.println("From teacher class. ");
    }

    @Override
    public String toString() {
        return "Teacher [name = "+name + ", gender = "+gender+", age = "+age+ "salary = " + salary + "]";
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
