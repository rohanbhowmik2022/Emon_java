import java.util.Scanner;

// Java program to find the prime numbers
// between a given interval
public class Prog7{

    // driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lower, upper, i, j, flag;
        System.out.println("Enter lower bound of the interval: ");
        lower = sc.nextInt();
        System.out.println("\nEnter upper bound of the interval: ");
        upper = sc.nextInt();
        for (i = lower; i <= upper; i++) {
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}