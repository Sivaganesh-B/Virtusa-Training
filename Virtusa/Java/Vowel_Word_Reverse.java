package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Vowel_Word_Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		int l = S.length();
		char s[] = new char[l];
		s = S.toCharArray();
		for(int i=0,j=l-1;i<j;i++,j--)
		{
			while(!(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'))
				i++;
			while(!(s[j]=='a'||s[j]=='e'||s[j]=='i'||s[j]=='o'||s[j]=='u'))
				j--;
			char t = s[i];
			s[i] = s[j];
			s[j] = t;
		}
		System.out.println(Arrays.toString(s));
	}

}
