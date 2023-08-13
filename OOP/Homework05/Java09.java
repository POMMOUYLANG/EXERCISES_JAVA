package Homework.Homework05;
import java.util.Scanner;
public class Java09 {
    public String message;

    public String encoderText(String message) {
        message = message.replace("\\n", "(new_line)");
        message = message.replace("\\t", "(tab)");
        message = message.replace("\\\\", "(slash)");
        message = message.replace("//", "(comment_line)");
        message = message.replace(":)", "(smile)");
        return message;
    }
    public String decoderText(String message) {
        message = message.replace("(new_line)", "\\n");
        message = message.replace("(tab)", "\\t");
        message = message.replace("(slash)", "\\");
        message = message.replace("(comment_line)", "//");
        message = message.replace("(smile)", ":)");
        return message;
    }

    public void menu() {
        System.out.print("""
                ***CE2-Message Coder***
                1-Text Encoder
                2-Text Decoder
                0-Exit
                -> Option:""");
    }
    public static void main(String[] args) {
        int option;
        String message;
        Scanner sc = new Scanner(System.in);
        Java09 ce2 = new Java09();
        do{
            ce2.menu();
            option = sc.nextInt();
            switch(option) {
                case 0:
                    System.out.println("Thank you!");
                    break;
                case 1:
                    System.out.println("--------------- Message Encoder ---------------");
                    System.out.print("Message: ");
                    sc.nextLine();
                    message = sc.nextLine();
                    System.out.println("\nEncoder:" + ce2.encoderText(message) + "\n");
                    break;
                case 2:
                    System.out.println("--------------- Message Decoder ---------------");
                    System.out.print("Message: ");
                    sc.nextLine();
                    message = sc.nextLine();
                    System.out.println("\nDecoder:" + ce2.decoderText(message) + "\n");
                    break;
                default:
                    System.out.println("Error: Option is not available!");
            }
        }
        while(option != 0);

        System.out.println("------------------------------------");
        sc.close();
    }
}
