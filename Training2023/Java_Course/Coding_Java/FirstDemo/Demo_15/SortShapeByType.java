package FirstDemo.Demo_15;

import java.util.Comparator;

public class SortShapeByType implements Comparator<Shape>{

    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.getType().compareTo(o2.getType());
    }
    
}
