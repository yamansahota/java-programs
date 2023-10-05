//annoymous objects calls
class g1
{
int x;
char y;
void disp()
{
System.out.print("Hello Frineds kaise ho ");
}
}
class g2
{
public static void main(String a[])
{
new g1().disp();
new g1().disp();

}
}