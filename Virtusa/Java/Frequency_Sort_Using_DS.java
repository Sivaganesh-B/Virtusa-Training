package Test;

import java.util.*;

public class Frequency_Sort_Using_DS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}sc.close();
		TreeMap<Integer,Integer> h = new TreeMap<Integer,Integer>();
		//HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			if(h.containsKey(a[i]))
			{
				int t = h.get(a[i]);
				t++;
				h.put(a[i],t);
			}
			else
			{
				h.put(a[i],1);
			}
		}
		System.out.println(h.toString());
	}

}
