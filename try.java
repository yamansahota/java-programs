class Ex
{
public static void main(String st[])
{
int x,y;
try 
{
x=Integer.parseInt(st[0]);
y=Integer.parseInt(st[1]);	
System.out.println("The sum of two no are : "  + (x+y));
}
catch(ArrayIndexOutOfBoundsException ar)
{
System.out.println("Enter Another value....");
}
catch(NumberFormatException er)
{
System.out.println("Wrong input for number");
}
System.out.println("Thanks for using the application");
}
}
