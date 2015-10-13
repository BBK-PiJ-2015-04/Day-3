
import java.util.Scanner;

public class No_04_Distance { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String str;
        Point one = new Point();
        System.out.println ("Please enter the first co-ordinate...");
        System.out.print ("The X value: ");
        str = System.console().readLine();
        one.x = Double.parseDouble(str);
        System.out.print ("The Y value: ");
        str = System.console().readLine();
        one.y = Double.parseDouble(str);
        System.out.println();
        Point two = new Point();
        System.out.println ("Please enter the second co-ordinate...");
        System.out.print ("The X value: ");
        str = System.console().readLine();
        two.x = Double.parseDouble(str);
        System.out.print ("The Y value: ");
        str = System.console().readLine();
        two.y = Double.parseDouble(str);
        System.out.println();
        Point three = new Point();
        System.out.println ("Please enter the third co-ordinate...");
        System.out.print ("The X value: ");
        str = System.console().readLine();
        three.x = Double.parseDouble(str);
        System.out.print ("The Y value: ");
        str = System.console().readLine();
        three.y = Double.parseDouble(str);
        System.out.println();
        double distance12, distance13, distance23;
        distance12 = Math.sqrt(((one.x - two.x) * (one.x - two.x)) + ((one.y - two.y) * (one.y - two.y)));
        distance13 = Math.sqrt(((one.x - three.x) * (one.x - three.x)) + ((one.y - three.y) * (one.y - three.y)));
        distance23 = Math.sqrt(((two.x - three.x) * (two.x - three.x)) + ((two.y - three.y) * (two.y - three.y)));
        if (distance12 < distance13 && distance12 < distance23) {
            System.out.println ("The Points 1 & 2 are the closest.");
        }
else if (distance13 < distance23) {
            System.out.println ("The Points 1 & 3 are the closest.");
        }
else {
            System.out.println ("The Points 2 & 3 are the closest.");
        }
    }
    static class Point {
        double x;
        double y;
    }
}