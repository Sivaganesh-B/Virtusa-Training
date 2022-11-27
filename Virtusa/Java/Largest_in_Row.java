package Test;

import java.util.Scanner;

public class Largest_in_Row {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}sc.close();
		for(int i=0;i<n;i++)
		{
			int k=a[i][0];
			for(int j=0;j<m;j++)
			{
				if(k<a[i][j])
				{
					k=a[i][j];
				}
			}
			System.out.println(k);
		}
	}

}
