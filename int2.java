interface in1
{
void disp();
}

interface in2
{
void get();
}
 class A
{
void cla()
{}
}

class B extends A implements in1,in2
{
public void disp()
{
System.out.println("The First Function Disp()");
}
public void get()
{
System.out.println("The First Function Get()");
}
void cla()
{
System.out.println("The Function from Class A ");
}

public static void main(String a[])
{
B obj1=new B();
obj1.disp();
obj1.get();
obj1.cla();
}
}

