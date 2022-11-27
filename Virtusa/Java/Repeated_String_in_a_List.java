package Test;
import java.util.*;

public class Repeated_String_in_a_List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> a = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			a.add(sc.next());
		}sc.close();
		int c =0;
		for(int i=0;i<n;i++)
		{
			int x =0,f=0 ;
			for(int j=0;j<n;j++)
			{
				if(a.get(i).equals(a.get(j)))
				{
					x++;
					f=1;
				}
			}
			if(f==1)
			{
				a.set(i,"!");
			}
			if(x==2) c++;
		}
		System.out.println(c);
	}

}
