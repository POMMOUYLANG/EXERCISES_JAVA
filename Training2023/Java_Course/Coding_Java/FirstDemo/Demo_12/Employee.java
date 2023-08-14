package FirstDemo.Demo_12;

import FirstDemo.Demo_11.Gender;

public class Employee {
    private int id;
    private String name;
    private Gender gender;
    private double salary;
    private employeeType EmployeeType;

    public static int count = 0;
    
    public Employee(String name, Gender gender, double salary, employeeType employeeType) {
        count++;
        this.id = count;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        EmployeeType = employeeType;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary
                + ", EmployeeType=" + EmployeeType + "]";
    }

    public int getAge() {
        return id;
    }

    public void setAge(int age) {
        this.id = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public employeeType getEmployeeType() {
        return EmployeeType;
    }

    public void setEmployeeType(employeeType employeeType) {
        EmployeeType = employeeType;
    }

    
}
