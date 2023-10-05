class A
{ 
int x=12;
int y=34;
A(int a, int b)
{
x=a;
y=b;
System.out.println("The value of A : " + a);
System.out.println("The value of B : " + b);
}
A(A obj)
{
x=obj.x;
y=obj.y;
System.out.println("The value of x is " + x);
System.out.println("The value of y is " + y);
}
}
class Sec
{
public static void main(String a[])
{
A obj1=new A(1,2);
A obj2=new A(obj1);
}
}


