package Homework.Homework04;
import java.util.Scanner;
public class Java06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance from point A to point B in kilometers: ");           // get distance from A to B
        double distanceAB = sc.nextDouble();

        System.out.print("Enter the weight of the goods in kilograms: ");                         // get weight of the goods
        double weight = sc.nextDouble();

        double petrolUsedAB = calculatePetrolUsed(weight, distanceAB);                             // calculate petrol used from A to B
        double remainingPetrol = 5000 - petrolUsedAB;
 
        System.out.print("Enter the distance from point B to point C in kilometers: ");           // get distance from B to C
        double distanceBC = sc.nextDouble();

        double petrolUsedBC = calculatePetrolUsed(weight, distanceBC);                             // calculate petrol used from B to C

        if (petrolUsedBC <= remainingPetrol) {                                                     // check if there is enough petrol to reach point C
            System.out.println("No need to refill at point B.");
        } else {
            double petrolToRefill = petrolUsedBC - remainingPetrol;
            System.out.println("Minimum number of liters needed to refill at point B: " + petrolToRefill);
        }
        sc.close();
    }
    public static double calculatePetrolUsed(double weight, double distance) {                // calculate petrol used
        double litersPerKm;

        if(weight <= 5000){
            litersPerKm = 10;
        }
        else if(weight <= 10000){
            litersPerKm = 20;
        }
        else if(weight <= 20000){
            litersPerKm = 25;
        }
        else if(weight <= 30000){
            litersPerKm = 35;
        }
        else{
            litersPerKm = Double.POSITIVE_INFINITY;
        }
        return litersPerKm * distance;
    }
}
