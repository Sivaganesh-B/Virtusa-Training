package Test;

import java.util.*;

public class Starting_Ending_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int n = s.length();
		int c = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+2;j<=n;j++)
			{
				String a = s.substring(i,j);
				int b = a.length();
				if(a.charAt(0)=='1' && a.charAt(b-1)=='1')
					c++;
			}
		}
		System.out.println(c);
	}

}
