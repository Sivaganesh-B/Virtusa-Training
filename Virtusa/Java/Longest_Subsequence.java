package Test;

import java.util.*;

public class Longest_Subsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}sc.close();
		int ans=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int s;
				ArrayList<Integer> h = new ArrayList<>();
				int t = a[i][j];
				h.add(t);
				s= hasNext(a,t,n,i,j);
				while(s!=-1)
				{
					h.add(s);
					s = hasNext(a,s,n,i,j);
				}
				System.out.println(h.toString());
				ans = ans > h.size() ? ans : h.size();
			}
		}
		System.out.println(ans);
	}
	public static int hasNext(int a[][],int e,int l,int x,int y)
	{
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if(a[i][j]==e+1)
				{
						return a[i][j];
				}
			}
		}
		return -1;
	}

}
