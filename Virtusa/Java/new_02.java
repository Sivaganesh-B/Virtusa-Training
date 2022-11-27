package Test;

import java.util.*;

public class new_02 {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for(int i=0;i<3;i++)
		{
			a[i] = sc.nextInt();
		}sc.close();
		int s1[] = new int[3];
		int s2[] = new int[3];
		int s3[] = new int[3];
		int s4[] = new int [3];
		s1[0] = (a[0]/1000)%10;
		s1[1] = (a[1]/1000) % 10;
		s1[2] = (a[2]/1000)%10;
		s2[0] = (a[0]/100)%10;
		s2[1] = (a[1]/100) % 10;
		s2[2] = (a[2]/100)%10;
		s3[0] = (a[0]/10)%10;
		s3[1] = (a[1]/10) % 10;
		s3[2] = (a[2]/10)%10;
		s4[0] = (a[0])%10;
		s4[1] = (a[1]) % 10;
		s4[2] = (a[2])%10;
		Arrays.sort(s1);
		Arrays.sort(s2);
		Arrays.sort(s3);
		Arrays.sort(s4);
		String ans = ((s1[2]-s1[0])+"") +(s2[2]-s2[0]) +(s3[2]-s3[0]) +(s4[2]-s4[0]) +"" ;
		System.out.println(ans);
	}
}
