package daily_test;
import java.util.*;
	
public class remove_duplicates {
	    public static void main(String []args)
	    {
	        Scanner sc = new Scanner(System.in);
	        String S = sc.nextLine();
	        sc.close();
	        StringBuffer s = new StringBuffer(S);
	        int n = s.length();
	        String ans = "";
	        for(int i=0;i<n;i++)
	        {
	            if(!(ans.contains(s.charAt(i)+"")))
	            ans = ans + s.charAt(i);
	        }
	        System.out.print(ans);
	    }
	}