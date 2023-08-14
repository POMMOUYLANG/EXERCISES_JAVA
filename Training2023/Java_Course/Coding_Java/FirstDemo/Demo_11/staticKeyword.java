package FirstDemo.Demo_11;

public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Dara", Gender.MALE, Grade.THREE);
        Student s2 = new Student("Lang", Gender.FEMALE, Grade.TWO);

        s1.setName("Dary");
        Student.numberOfStudent = 20;
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        // Student.print(); 
        
    }
}
