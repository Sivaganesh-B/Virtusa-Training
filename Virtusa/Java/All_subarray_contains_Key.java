package Test;

import java.util.Arrays;
import java.util.Scanner;

public class All_subarray_contains_Key {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
		int f=0;
		String ans = "Yes";
		for(int i=0;i<a.length;i=i+k)
		{
			if(i+k<=a.length)
			{
				int b[] = Arrays.copyOfRange(a, i, i+k);
				if(!(contain(b,x)))
				{
					f=1;
					break;
				}
			}
			else
			{
				int b[] = Arrays.copyOfRange(a, i,a.length);
				if(!(contain(b,x)))
				{
					f=1;
					break;
				}
			}
		}
		if(f==1)  ans = "No";
		System.out.println(ans);
	}
	public static boolean contain(int a[],int k)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k) return true;
		}
		return false;
	}
}
