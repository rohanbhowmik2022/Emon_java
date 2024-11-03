import java.util.*;
public class Prog1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in seconds: ");
        int sec = sc.nextInt();
        int hour = 0, resec= 0, minute = 0;
        hour = sec/3600;
        minute = (sec%3600)/60;
        resec = (sec%3600)%60;
        System.out.println(hour+" Hours");
        System.out.println(minute+" minutes");
        System.out.println(resec +" seconds");
    }
}
