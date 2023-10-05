interface in1
{
 void disp();
 int x=10;
}

interface in2
{
	void get();
	char f1='A';
}

class A implements in1,in2
{
public void disp()
{
 System.out.print(in1.x);
}

public void get()
{
 	System.out.print(in2.f1);
}

public static void main(String a[])
{
	A obj1=new A();
	obj1.disp();
	obj1.get();
}
}
