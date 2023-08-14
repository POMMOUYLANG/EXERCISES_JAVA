package FirstDemo.Demo_12;

import FirstDemo.Demo_11.Gender;

public class EmployeeApp {
    public static void main(String[] args) {
        //Create 5 object Employees (id icrease automatically)
        Employee e1 = new Employee("Dara", Gender.MALE, 900, employeeType.FULL_TIME);
        Employee e2 = new Employee("Lang", Gender.FEMALE, 900, employeeType.FULL_TIME);
        Employee e3 = new Employee("Dada", Gender.FEMALE, 700, employeeType.PART_TIME);
        Employee e4 = new Employee("Dalin", Gender.FEMALE, 500, employeeType.INTERNSHIP);
        Employee e5 = new Employee("Veana", Gender.MALE, 700, employeeType.PART_TIME);
        Employee e6 = new Employee("Dada", Gender.FEMALE, 500, employeeType.INTERNSHIP);
        // System.out.println(e1.toString());
        // System.out.println(e2);
        // System.out.println(e3);
        // System.out.println(e4);
        // System.out.println(e5);
        // System.out.println(e6);
        Employee[] employees = new Employee[] {e1,e2,e3,e4,e5,e6};
        System.out.println(Employee.count);
        // System.out.println(Arrays.toString(employees));

        //Count female employees
        EmployeeService employeeService = new EmployeeService();
        // int numberOfFemale = employeeService.countFemaleEmployees(employees); //not static in countFemaleEmployees
        // int numberOfMale = employeeService.countMaleEmployees(employees); //not static in countFemaleEmployees
        // int numberOfFemale = EmployeeService.countFemaleEmployees(employees); //static in countFemaleEmployees
        // System.out.println("Female = "+numberOfFemale);
        // System.out.println("MAle = "+numberOfMale);
        // int numberOfFemale = employeeService.countEmployeesByGender(employees,Gender.FEMALE);
        // int numberOfMale = employeeService.countEmployeesByGender(employees,Gender.MALE);
        // System.out.println("Female = "+numberOfFemale);
        // System.out.println("MAle = "+numberOfMale);

        // //calcuate bonus of employee (fulltime: 5%, part-time:3%, internship: 2%;)
        // double bonusE1 = employeeService.caluateBonus(e1);
        // double bonusE3 = employeeService.caluateBonus(e3);
        // double bonusE6 = employeeService.caluateBonus(e6);
        // System.out.println("FULL_TIME = "+bonusE1);
        // System.out.println("PART_TIME = "+bonusE3);
        // System.out.println("INTERNSHIP = "+bonusE6);

        //Show total payment for each employee (salary + bonus)
        double paymentE1 = employeeService.calculateTotalPAymentOfEmployee(e1);
        System.out.println("FULL_TIME = "+paymentE1);
    }
}
