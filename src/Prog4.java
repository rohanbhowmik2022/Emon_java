import java.util.*;
public class Prog4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a,(Math.max(b,c)));
        int min = Math.min(a,(Math.min(b,c)));
        System.out.println("Greatest: "+max);
        System.out.println("Smallest: "+min);
    }
}
