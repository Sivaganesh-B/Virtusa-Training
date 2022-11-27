package Test;

import java.util.Scanner;

public class vowel_To_Next_Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		String vowel = "aeiouAEIOU";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(vowel.contains(s.charAt(i)+""))
			{
				System.out.println(s.substring(i,s.length()));
				s = s.substring(0,i);
			}
		}
	}

}
