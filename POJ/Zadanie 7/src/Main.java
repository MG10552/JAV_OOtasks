class A
{
	static int i=1;
	void f()
	{ System.out.println("A: "+(++i));
	}
	
	void g()
	{
		this.f();
	}
}
class B extends A
{
	void f()
	{
		System.out.println("B: "+ (i++));
	}
	void h()
	{
		super.f();
	}
}
class C extends B
{
void f()
{
	System.out.println("C: "+(++i));
	this.h();
}
void g()
{
	super.f();
}
}
	
	
public class Main {

	
	
	public static void main(String[] args)
	{
		A a = new A();
		a.f();
		a.g();
		B b = new B();
		b.f();
		b.g();
		b.h();
		C c = new C();
		c.f();
		c.g();
		c.h();
	}
}
