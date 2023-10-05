class K
{
void disp()
{
System.out.print("hello friends kaise ho ");
}
}
class J extends K
{
public void disp()
{
System.out.println("Whats'up Guys kaise ho");
}
}
class L
{
public static void main(String a[])
{
J ob=new J();
ob.disp();
K o1=new K();
o1.disp();
}
}
 