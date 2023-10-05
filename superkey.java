class A
{ 
int x=123;
}

class b extends A 
{
char x ='A';
void ds()
{
System.out.println("The value of Local Variable : " + x);
System.out.print( "The Value of Super Class Instance Variable : "+super.x);
} 
}
class c
{
public static void main(String a[])
{
b obj1=new b();
obj1.ds();
}
}