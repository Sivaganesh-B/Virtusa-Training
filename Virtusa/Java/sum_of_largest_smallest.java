package daily_test;
import java.util.*;
public class sum_of_largest_smallest
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }sc.close();
        Arrays.sort(a);
        System.out.print(a[0]+a[n-1]);
    }
}