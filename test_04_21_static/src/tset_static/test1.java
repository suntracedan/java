package tset_static;
//同一个包的两个非私有类可以互相访问
public class test1 {
	private static int i=10;//类中被static修饰的对象，属于类本身，在类外只能用类名进行访问、但不能为private；
	public void fun()//没有被static修饰的成员必须用类构建一个对象，通过构建的对象来访问成员
	{
		System.out.printf("%d\n",i);//在类外可以访问共有方法中包含的私有成员
	}
}
