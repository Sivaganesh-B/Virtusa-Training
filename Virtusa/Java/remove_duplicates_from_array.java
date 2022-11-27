package daily_test;
import java.util.*;
public class remove_duplicates_from_array
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }sc.close();
        for(int i=0;i<n;i++)
        {
            int c =0 ;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j]) c++;
            }
            if(c==1)
            {
                al.add(a[i]);
            }
            else
            {
                if(!(al.contains(a[i])))
                al.add(a[i]);
            }
        }
        for(int i:al)
        {
            System.out.print(i+" ");
        }
    }
}