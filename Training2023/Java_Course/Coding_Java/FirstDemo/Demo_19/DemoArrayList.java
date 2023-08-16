package FirstDemo.Demo_19;

import java.util.ArrayList;
import java.util.Comparator;

public class DemoArrayList {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
    // add element
        nameList.add("Lang");
        nameList.add("Dara");
        nameList.add("Moll");
        // System.out.println(nameList);

    // access element
        // String name = nameList.get(0);
        // System.out.println(name);

    //update element
        // nameList.set(1,"Vanda");
        // System.out.println(nameList);

    //remove element
        // nameList.remove(0);
        // System.out.println(nameList);
    //size of arryalist 
        // System.out.println(nameList.size());
    //Sort of arraylist
        // Comparator<String> nameCompare = new Comparator<String>(){
        //     @Override
        //     public int compare(String o1, String o2){
        //         return o1.compareTo(o2);
        //     }
        // };
        // nameList.sort(nameCompare);
        // System.out.println("===================");
        // System.out.println(nameList);

    // contains of array
        //boolean exist = nameList.contains("Dara");
    // isEmpty of arraylist
        // System.out.println(nameList.isEmpty());
    // indexOf of arraylist
        // System.out.println(nameList.indexOf("Lang"));
    // For loop
        for(int i=0; i<nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
    // For each loop
        for(String name : nameList){
            System.out.println(name);
        }
    }
}