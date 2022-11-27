package daily_test;
import java.util.*;
public class check_palindrome
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int l = s.length();
        int ans =1;
        for(int i=0,j=l-1;i<j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                ans = 0;
                break;
            }
        }
        System.out.print(ans);
    }
}