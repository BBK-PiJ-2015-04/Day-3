
import java.util.Scanner;

public class No_02_Calculator { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String str;
        System.out.print ("Please enter a number ");
        str = System.console().readLine();
        double number1 = Integer.parseInt(str);
        System.out.print ("Please enter another number ");
        str = System.console().readLine();
        double number2 = Integer.parseInt(str);
        System.out.println ("Please choose an operation to perform: ");
        System.out.println ("(1) Add (2) Subtract (3) Multiply (4) Divide");
        System.out.print ("Your choice: ");
        str = System.console().readLine();
        int operation = Integer.parseInt(str);
        if (operation == 1) {
            System.out.println (number1 + number2);
        }
else if (operation == 2) {
            System.out.println (number1 - number2);
        }
else if (operation == 3) {
            System.out.println (number1 * number2);
        }
else {
            System.out.println (number1 / number2);
        }
    }
}