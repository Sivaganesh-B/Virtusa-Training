package daily_test;
import java.util.*;
public class palindrome_yes_no
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String ans = "Yes";
        for(int i=0,j=s.length()-1;i<j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                ans = "No";
                break;
            }
        }
        System.out.print(ans);
    }
}