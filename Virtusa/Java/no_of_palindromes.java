package daily_test;
import java.util.*;
public class no_of_palindromes
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        sc.close();
        n = n + 1;
        int c = 0;
        s = s + " ";
        String w = "";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=' ')
            {
                w = w + s.charAt(i);
            }
            else
            {
                if(ispalin(w)) c++;
                w = "";
            }
        }
        System.out.print(c);
    }
    public static boolean ispalin(String w)
    {
        int l=w.length();
        for(int i=0,j=l-1;i<j;i++,j--)
        {
            if(w.charAt(i)!=w.charAt(j)) return false;
        }
        return true;
    }
}