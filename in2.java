class A 
{
int x;
A()
{
System.out.print(x);
}
A(int y)
{x=y;
System.out.print(x);
}
}
class B
{
public static void main(String a[])
{
A ob1=new A(12);
A ob2=new A(23);
}
}