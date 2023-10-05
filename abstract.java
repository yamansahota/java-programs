abstract class A
{
abstract void disp();
abstract void get();
}
class B extends A
{
void disp()
{
System.out.print("Hello Abstract Function");
}
void get()
{
System.out.print("Another Function");
}
}
class C
{
public static void main(String b[])
{
B ob=new B();
ob.disp();
ob.get();
}
}