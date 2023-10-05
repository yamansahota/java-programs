abstract class A
{
void disp()
{
System.out.print("Hello Function Disp()");
}
}
class B extends A
{
void disp(A obj)
{
System.out.println("Next Function"); // The statement was executed 
obj.disp();
}
	public static void main(String a[])
	{
		A ob=new B();
		B ho= new B();
		ho.disp(ob);
	}
}