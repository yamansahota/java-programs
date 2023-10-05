class A 
{ 
A(int y) 
{
System.out.print(y);
 }
}
class B extends A
{
B()
{
super(10);
System.out.print("Class B ");
}
}
class C
{
public static void main(String a[])
{
 B obj=new B();
}
}
