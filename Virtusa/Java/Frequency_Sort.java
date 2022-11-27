package Test;
import java.util.*;

public class Frequency_Sort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}sc.close();
		
		int c[] = new int[n];
		for(int i=0;i<n;i++)
		{
			int co=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j]) co++;
			}
			c[i] = co;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(c[i]>c[j])
				{
					int t=c[i];
					c[i] = c[j];
					c[j] = t ;
					t = a[i];
					a[i] = a[j];
					a[j]= t;
				}
			}
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(c[i]==c[j] && a[i]>a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
