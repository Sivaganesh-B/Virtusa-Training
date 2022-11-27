package daily_test;
import java.util.*;
public class if_x_contains_y
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        if(a.length()==b.length() && a.contains(b))
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
