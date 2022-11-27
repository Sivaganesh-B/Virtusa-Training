package Test;
import java.util.*;
public class new_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a [] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] =sc.nextInt();
		}sc.close();
		ArrayList<Integer> st = new ArrayList<Integer> ();
		ArrayList<Integer> ust = new ArrayList<Integer> ();
		for(int i=0;i<5;i++)
		{
			if(isStable(a[i]))
			{
				st.add(a[i]);
			}
			else
			{
				ust.add(a[i]);
			}
		}
		int s1 = st.size();
		int s2 =ust.size();
		int ans = (s1*10) + s2;
		System.out.println(ans);
	}
	private static  boolean isStable(int x)
	{	
		int n = x,c=0;
		while(n!=0)
		{
			c++;
			n = n / 10;
		}
		int a[] = new int[c];
		String s = x + "";
		for(int i=0;i<c;i++)
		{
			int b = 0;
			for(int j=0;j<c;j++)
			{
				if(s.charAt(i)==s.charAt(j))
					b++;
			}
			a[i] = b;
		}
		for(int i=1;i<c;i++)
		{
			if(a[i-1]!=a[i]) return false;
		}
		return true;
	}
}
