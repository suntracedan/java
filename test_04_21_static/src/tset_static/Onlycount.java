package tset_static;

public class  Onlycount {
	public int i=20;
	private Onlycount()
	{
	}
	private static Onlycount oc=new Onlycount();
	public static Onlycount Get()
	{
		return oc;
	}
}
