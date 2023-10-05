interface in1
{
void dp();
}
interface in2 extends in1
{
void get();
}
class A implements in2
{
public void dp()
{
System.out.println("The First Function Disp()");
}
public void get()
{
System.out.println("The First Second	 Get()");
}
public static void main(String a[])
{
A ob=new A();
ob.dp();
ob.get();
}
}

