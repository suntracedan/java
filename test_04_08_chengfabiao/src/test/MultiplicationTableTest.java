package test;
public class MultiplicationTableTest {
	public static void Test()
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j>1)
				{
					System.out.print("  ");
				}
				System.out.print(i+"*"+j+"="+(i*j));
			}
			System.out.println();	
		}
	}
	private static void Test1()
	{
		int count=5;
		for(int i=0;i<=count;i++)
		{
			for(int j=0;j<=count-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Test1();
	}
	
}
