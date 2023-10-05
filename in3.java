class A
{
int x;
int y;
A(int a, int b)
{
x=a;
y=b;
}
A(A obj)
{
x=obj.x;
y=obj.y;
System.out.print(x);
System.out.print(y);
}
}
class B
{
public static void main(String a[])
{
A obj1=new A(1,2);
A obj2= new A(obj1);
}
}