package Homework.Homework09;

import java.util.Scanner;
public class Java01_Student_List {
    private String name;
    private String date_Of_Birth;
    private String telephone_Number;
    private String city;
    private String country;
    private String group;

    public Java01_Student_List() {
    }
    public Java01_Student_List(String name, String date_Of_Birth, String telephone_Number, String city, String country, String group) {
        this.name = name;
        this.date_Of_Birth = date_Of_Birth;
        this.telephone_Number = telephone_Number;
        this.city = city;
        this.country = country;
        this.group = group;
    }
    public void InputStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        name = sc.nextLine();

        System.out.print("Enter the student's date of birth: ");
        date_Of_Birth = sc.nextLine();

        System.out.print("Enter the student's telephone number: ");
        telephone_Number = sc.nextLine();

        System.out.print("Enter the student's city: ");
        city = sc.nextLine();

        System.out.print("Enter the student's country: ");
        country = sc.nextLine();

        System.out.print("Enter the student's group: ");
        group = sc.nextLine();
        sc.close();
    }
    public void DisplayStudent() {
        System.out.println("\n-------Student details-------\n");
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + date_Of_Birth);
        System.out.println("Telephone number: " + telephone_Number);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Group: " + group);
    
    }
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return date_Of_Birth;
    }

    public void setDateOfBirth(String date_Of_Birth) {
        this.date_Of_Birth = date_Of_Birth;
    }

    public String getTelephoneNumber() {
        return telephone_Number;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephone_Number = telephoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public static void main(String[] args) {
        Java01_Student_List stu = new Java01_Student_List();
        stu.InputStudent();
        stu.DisplayStudent();
    }
}