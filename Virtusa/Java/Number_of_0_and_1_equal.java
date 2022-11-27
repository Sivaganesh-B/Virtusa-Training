package Test;

import java.util.Scanner;

public class Number_of_0_and_1_equal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		int l = s.length();
		int c = 0;
		for(int i=0;i<l;i++)
		{
			for(int j=i+2;j<=l;j++)
			{
				int o=0,z=0;
				String a = s.substring(i,j);
				n = a.length();
				for(int k=0;k<n;k++)
				{
					if(a.charAt(k)=='1') o++;
					if(a.charAt(k)=='0') z++;
				}
				if(o==z) c++;
			}
		}
		System.out.println(c);
	}

}
