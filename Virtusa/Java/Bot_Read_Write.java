package Test;

import java.util.*;

public class Bot_Read_Write {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		int l1 = sc.nextInt();
		int p2 = sc.nextInt();
		int l2 = sc.nextInt();
		int r = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();
		sc.close();
		
		int pa = p1*l1;
		int pb = p2*l2;
		
		int a = pa/r;
		
		if(t>=a)
		{
			System.out.println("Writing");
			pa = t-a;
			int y = (pa*w)/l2;
			int ya = (pa*w)%l2;
			ya = (ya==0 ? l2 : ya);
			System.out.println(y + "  "+ ya);
		}
		else
		{
			System.out.println("Reading");
			int y = (t*r)/l1;
			int ya = (t*r)%l1;
			pb = l1;
			ya = (ya==0 ? pb : ya);
			System.out.println(y+"  "+ya);
		}
	}

}
