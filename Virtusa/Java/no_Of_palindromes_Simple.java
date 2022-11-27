package daily_test;

public class no_Of_palindromes_Simple {

	public static void main(String[] args) {
		String s = "This is a game of level deed";
		String a[] = s.split(" ");
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			String w = a[i];
			if(isPalin(w)) c++;
		}
		System.out.println(c);
	}
	public static boolean isPalin(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		return s.equals(sb.toString());
	}
}
