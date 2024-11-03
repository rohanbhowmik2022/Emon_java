import java.util.*;
public class Prog2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the pendulum: ");
        int length = sc.nextInt();
        System.out.println("Enter acceleration due to gravity: ");
        double g = sc.nextDouble();
        double T = 0.0;
        T = 2.0 * 3.14 * Math.sqrt(length/g);
        System.out.println("Time period: "+T+" seconds");

    }
}
