import java.util.*;
public class Prog3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marked price of the product: ");
        double mp = sc.nextInt();
        double da = 0.0, amt = 0.0;
        if(mp <= 1000.0)
        {
            da = mp * 0.02;
            amt = mp - da;
        }
        else
            if((mp>1000.0) && (mp <= 5000.0))
            {
                da = mp * 0.04;
                amt = mp-da;
            }
        else
            if((mp > 5000.0) && (mp <= 10000.0))
            {
                da = mp * 0.08;
                amt = mp - da;
            }
        else
            {
                da = mp * 0.1;
                amt = mp-da;
            }
        System.out.println("Discount amount: "+da);
        System.out.println("Amount to be paid: "+amt);
    }
}
