package tset_static;

public class Javacount {
	private static int count=0;
	public static int i=0;
	Javacount()
	{
		count++;
	}
	Javacount(int i)
	{
		Javacount.i=i;
		count++;
	}
	public int GetCount()
	{
		return count;
	}

}
