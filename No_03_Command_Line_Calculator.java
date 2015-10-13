
import java.util.Scanner;

public class No_03_Command_Line_Calculator { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String userInput;
        System.out.print ("Please enter command:  ");
        userInput = System.console().readLine();
        int length5;
        int i;
        int operator_location = -1;
        length5 = userInput.length();
        System.out.println (length5);
        System.out.println (userInput.substring(0,1));
        for (i = 0; i <= (length5 - 1); i++) {
            if(userInput.substring(i, i + 1) == "+") {
                operator_location = i;
                System.out.println(operator_location);
            }
            System.out.println("Hello World");
        }
        System.out.println (operator_location);
    }
}