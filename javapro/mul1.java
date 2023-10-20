package  pk1;

class B
{
 void disp()
	{
	System.out.println("Content of disp() function");
	}
}

class A
{
	public static void main(String a[])
	{
	System.out.println("First Package of PK1");
	B obj=new B();
	obj.disp();
	}
}
