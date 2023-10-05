class A
{
int x ;
int y;
A(int a, int b)
{
x=a;
y=b;
System.out.print(x);
System.out.print(y);
}
A( A obj)
{
x=obj.a;
y=obj.b;
System.out.print(x);
System.out.print(y);
}
}
class j
{
public static void main(String a[])
{
A obj1=new A(12,34);
A obj2=new A(obj1);
}
}