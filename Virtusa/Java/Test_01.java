package Test;
import java.util.*;
public class Test_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a [] = new int[n];
		int b[]= new int[n];
		for(int i=0;i<n;b[i++]=sc.nextInt());
		sc.close();
		a[0]=Integer.MAX_VALUE;
		int c=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<=i;j++)
		    {
		    	if(b[i]==a[j] && b[i] !=('_'))
		    	{
		    		c++;
		    		b[i]='_';
		    		
		    	}
		    	else
		    	{
		    		a[j]=b[i];
		    	}
		    }
		}
		System.out.println(n-c);
	}
}
