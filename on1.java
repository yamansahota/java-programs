class A 
{
int x;
}
class B extends A
{
void disp()
{
x=123;
System.out.print(x);
}
}
class C
{
public static void main(String a[])
{
B obj1=new B();
obj1.disp();
}
}
