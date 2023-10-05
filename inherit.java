class A
{ 
int x=34;
A()
{
System.out.print(x);
}
A(int y)
{
x=y;
System.out.print(y);
}
}
class B
{
public static void main(String a[])
{
A obj1=new A();
A obj2=new A(23);
}
}