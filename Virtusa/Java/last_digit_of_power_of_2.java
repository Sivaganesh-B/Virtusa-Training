package daily_test;
import java.util.*;
public class last_digit_of_power_of_2
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int p =(int) Math.pow(n,k);
        System.out.print(p%10);
    }
}