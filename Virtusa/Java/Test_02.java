package Test;

import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				
				if(j<i || j>=2*n-i+1)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

}
