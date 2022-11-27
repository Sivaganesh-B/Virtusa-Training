package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabets_Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int n = s.length();
		String a ="";
		String b = "";
		String ans = "";
		for(int i=0;i<n;i++)
		{
			int t = s.charAt(i);
			if(t>=65 && t<=90) a = a + s.charAt(i);
			if(t>=97 && t<=122) b = b + s.charAt(i);
		}
		int u=a.length();
		int l=b.length();
		char up [] = new char[u];
		char low [] = new char[l];
		up = a.toCharArray();
		low =b.toCharArray();
		Arrays.sort(up);
		Arrays.sort(low);
		System.out.println(l+" "+u);
		int y=0,z=0;
		if(u==l)
		{
			for(int i=0;i<n;i++)
			{
				if(i%2==0) ans = ans + up[y++];
				else ans = ans + low[z++];
			}
		}
		if(u>l)
		{
			for(int i=0;z<l;i++)
			{
				if(i%2==0) ans = ans + up[y++];
				else ans = ans + low[z++];
			}
			for(;y<u;) ans = ans + up[y++];
		}
		if(u<l)
		{
			for(int i=0;z<u;i++)
			{
				if(i%2==0) ans = ans + up[y++];
				else ans = ans + low[z++];
			}
			for(;z<l;) ans = ans + low[z++];
		}
		
		System.out.println(ans);
	}
}
