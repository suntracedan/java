package tset_static;

public class test {
	public int Sum(int...nums)//�ɱ�����ķ�������ʱ������main�����й���һ�������ͨ���������з��ʡ�
	{
		int result=0;
		for(int n:nums)
		{
			result+=n;
		}
		return result;
	}

	public static void main(String[] args)
	{
		Onlycount oc=Onlycount.Get();
		System.out.print(oc.i=10);
		
//		Javacount jc=new Javacount();
//		Javacount jc2=new Javacount(3);
//	    System.out.printf("%d\n",jc2.i);
//		System.out.printf("%d\n",jc.GetCount());
//		System.out.print(Javacount.i);
		//test t=new test();
		//System.out.println(t.Sum(10,9,8));
		//System.out.print(t.Sum(10,9,8));
		//test1.i=20;
//    	test1 aa=new test1();
//		test1 bb=new test1();
//		aa.fun();
//		bb.fun();
//		System.out.print(bb.i=10);
//		int[] arry={1,2,3,4,5};
//			for(int element:arry)
//			{
//				System.out.println(element);
//			}
/*		System.out.println("�����в����б�");
		for(int i=0;i<args.length;i++)
		{
			System.out.println("args["+i+"]:"+args[i]);
		}*///����������ʾ����java CmdParamTest ��ִ��
	}
}
