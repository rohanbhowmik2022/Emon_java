//This is to check
import java.util.*;
public class Prog5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of the product: ");
        double CP = sc.nextDouble();
        System.out.println("Enter the selling price of the product: ");
        double SP = sc.nextDouble();
        double result = 0.0, res_percent = 0.0;
        if(SP > CP)
        {
            result = SP - CP;
            res_percent = (result/CP)*100.0;
            System.out.println("You made a profit !");
            System.out.println("Actual profit: "+result);
            System.out.println("Profit Percentage: "+res_percent+" % ");
        }
        else
            if(CP > SP)
            {
                result = CP - SP;
                res_percent = (result/CP)/100.0;
                System.out.println("You made a loss !");
                System.out.println("Actual loss: "+result);
                System.out.println("Loss Percentage: "+res_percent+"%");
            }
        else
                System.out.println("Neither profit nor loss !");

    }
}
