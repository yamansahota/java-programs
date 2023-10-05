class A 
{
int x=100;
}
class B extends A
{  
int y=123;
public static void main(String[] a)
{
B obj=new B();
System.out.println(obj.x);
System.out.println(obj.y);
}
}
