package daily_test;
import java.util.*;
public class reverse_word_wise {
	    public static void main(String []args)
	    {
	        Scanner sc = new Scanner(System.in);
	        String S = sc.nextLine();
	        sc.close();
	        S = S.trim();
	        StringBuffer s = new StringBuffer(S);
	        String ans = "";
	        int n = s.length();
	        int k = n;
	        for(int i=n-1;i>=0;i--)
	        {
	            if(s.charAt(i)==' ')
	            {
	                ans = ans + s.substring(i+1,k)+" ";
	                s.delete(i,k);
	                k = s.length();
	            }
	        }
	        ans = ans + s;
	        System.out.print(ans);
	    }
	}