package daily_test;
import java.util.*;
public class fanny_occurrence
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        sc.close();
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=c)
            ans = ans + s.charAt(i);
        }
        System.out.print(ans);
    }
}