class A1
{
	A1(int i)
	{
		System.out.println("A: "+i);
	}
	A1(int i, int j)
	{
		System.out.println("A: "+i*j);
		}
		A1()
		{
			System.out.println("A: ");
		}
	}
class B1 extends A1
{
	B1(int i)
	{
		super(i+1,i);
		System.out.println("B: "+i+i);
	}
	B1()
	{
		super(1,3);
		System.out.println("B: "+3);
	}
}
class C1 extends B1
{
	C1(int i)
	{
		super(i+2);
		System.out.println("C: "+ (i+1));
	}
}

public class Program {

	public static void main(String[] args)
	{
		C1 c = new C1(4);
	}
}
