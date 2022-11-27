package daily_test;
import java.util.*;
public class increasing_order_in_array {
	    public static void main(String []args)
	    {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = sc.nextInt();
	        }sc.close();
	        String f = "YES";
	        for(int i=0;i<n-1;i++)
	        {
	            if((a[i+1]-1)!=a[i])
	            {
	                f="NO";
	                break;
	            }
	        }
	        System.out.print(f);
	    }
	}