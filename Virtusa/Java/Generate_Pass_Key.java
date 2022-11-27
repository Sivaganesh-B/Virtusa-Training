package Test;

import java.util.Scanner;

public class Generate_Pass_Key {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		sc.close();
		String ans = "";
		String vowels = "aeiouAEIOU";
		for(int i=0;i<s1.length();i++)
		{
			if(vowels.contains(s1.charAt(i)+""))
			{
				ans += "%";
			}
			else
			{
				ans += s1.charAt(i);
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			if(!(vowels.contains(s2.charAt(i)+"")))
			{
				ans += "#";
			}
			else
			{
				ans += s2.charAt(i);
			}
		}
		s3 = s3.toUpperCase();
		ans +=s3;
		System.out.println(ans);
	}

}
