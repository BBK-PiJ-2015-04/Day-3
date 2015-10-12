
import java.util.Scanner;

public class No_04_Distance { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String str;
        double distance12, distance13, distance23;
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
        Distance one = new Distance();
        System.out.println(one.x);
        System.out.println(one.y);
        System.out.println(two.x);
        System.out.println(two.y);
        System.out.println(three.x);
        System.out.println(three.y);
    }
    static class Point {
        double x;
        double y;
    }
    static class Distance {
        double z;
    }
}