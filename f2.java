class fun
{
int x=12;
int y=44;
void disp()
{
System.out.print(x+","+y);
}
public static void main(String a[])
{
fun he=new fun();
he.disp();
fun h2=he;
he= new fun();
h2=new fun();
}
}