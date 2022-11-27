package Test;

import java.util.Scanner;

public class Climpimg_stairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int ans = Climp(n);
		System.out.println(ans);
	}
	public static int Climp(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else if(n<0)
		{
			return 0;
		}
		else
		{
			return Climp(n-3)+Climp(n-2)+Climp(n-1);
		}
	}
}
