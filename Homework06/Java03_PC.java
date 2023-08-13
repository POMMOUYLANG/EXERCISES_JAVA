package Homework.Homework06;
import java.util.Scanner;
public class Java03_PC {
    private static String[] qaulity = new String[10];
    private static String[] pc = new String[10];
    public Java03_PC() {
        for(int i=0; i<10; i++) {
            int model = i+1;
            pc[i] = "PC" + model;
            qaulity[i] = "(No info)";
        }
    }

    public static void main(String[] args) {
        int choice = 0;

        Scanner sc = new Scanner(System.in);
        Java03_PC ex3 = new Java03_PC();
        //pc.setPC();
        System.out.println(pc[0]);

        do {
            System.out.print("""
                -------------------------------------
                          PC in DICE’s Lab
                -------------------------------------
                1. List all PCs
                2. List all damages PCs
                3. List all good PCs
                4. Mark a PC as damaged
                5. Mark a PC as not damaged
                6. Quit
                Choice: """);
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice) {
                    case 1:
                        ex3.listAllPC();
                        break;
                    case 2:
                        ex3.listDemagedPC();
                        break;
                    case 3:
                        ex3.listGoodPC();
                        break;
                    case 4:
                        ex3.markDemagePC(sc);
                        break;
                    case 5:
                        ex3.markGoodPC(sc);
                        break;
                    case 6:
                        System.out.println("Good bye..!");
                        break;
                    default:
                        System.out.println("Invalid choice, please try again...");
                        break;
                }
        }
        while(choice != 6);
    }

    public void listAllPC() {
        System.out.println("Model\tQuality");
        System.out.println("-------------------------------------");
        for(int i=0; i<10; i++) {
            System.out.print(pc[i] + "\t");
            if(qaulity[i].equalsIgnoreCase("")) {
                System.out.println("(No Info)");
            }
            else {
                System.out.println(qaulity[i]);
            }
        }
    }

    public void listDemagedPC() {
        boolean demaged = false;
        System.out.println("Model\tQuality");
        System.out.println("-------------------------------------");
        for(int i=0; i<10; i++) {
            if(qaulity[i].equalsIgnoreCase("demaged")) {
                System.out.print(pc[i] + "\t");
                System.out.println(qaulity[i]);
                demaged = true;
            }
        }

        if(!demaged) {
            System.out.println("There's no demaged PC...!");
        }
    }

    public void listGoodPC() {
        boolean good = false;
        System.out.println("Model\tQuality");
        System.out.println("-------------------------------------");
        for(int i=0; i<10; i++) {
            if(qaulity[i].equalsIgnoreCase("good")) {
                System.out.print(pc[i] + "\t");
                System.out.println(qaulity[i]);
                good = true;
            }
        }

        if(!good) {
            System.out.println("There's no good PC...!");
        }
    }

    public void markDemagePC(Scanner sc) {
        System.out.print("How many demaged PC: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++) {
            boolean found = false;
            System.out.print("Input PC Model(ex:PC1): ");
            String model = sc.nextLine();
            for(int k=0; k<10; k++) {
                if(pc[k].equalsIgnoreCase(model)) {
                    qaulity[k] = "demaged";
                    found = true;
                    System.out.println("Info saved...");
                    break;
                }
            }

            if(!found) {
                System.out.println("Invalid PC model...");
            }
        }
    }

    public void markGoodPC(Scanner sc) {
        System.out.print("How many good PC: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++) {
            boolean found = false;
            System.out.print("Input PC Model(ex:PC1): ");
            String model = sc.nextLine();
            for(int k=0; k<10; k++) {
                if(pc[k].equalsIgnoreCase(model)) {
                    qaulity[k] = "good";
                    found = true;
                    System.out.println("Info saved...");
                    break;
                }
            }

            if(!found) {
                System.out.println("Invalid PC model...");
            }
        }
    }
}
