class A 
{
void id()
{
System.out.println("Class A function" );
}
}
class B extends A
{
void id()
{
System.out.print("Class B function");
}
}
class C
{ 
public static void main(String a[])
{
A obj1=new B();
B obj2=new A();
obj1.id();
obj2.id();
}
}
