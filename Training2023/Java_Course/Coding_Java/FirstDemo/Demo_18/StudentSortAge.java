package FirstDemo.Demo_18;

import java.util.Comparator;

public class StudentSortAge implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        // return o1.getAge() - o2.getAge(); // big > small
        return o2.getAge() - o1.getAge(); // small < big
    } 
}
