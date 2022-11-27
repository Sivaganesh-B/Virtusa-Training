package daily_test;
import java.util.*;
public class zero_at_end
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s [] = sc.nextLine().split(" ");
        int n = sc.nextInt();
        sc.close();
        int a[] = new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            int t = Integer.parseInt(s[i]);
            if(t!=0)
            {
                a[k++] = t;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}