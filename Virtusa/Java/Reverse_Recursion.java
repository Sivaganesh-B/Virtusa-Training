package Test;

import java.util.Scanner;

public class Reverse_Recursion {

	static int a=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ans = recur(n);
		System.out.println(ans);
	}
	public static int recur(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			a = (a*10)+(n%10);
			recur(n/10);
		}
		return a;
	}

}
