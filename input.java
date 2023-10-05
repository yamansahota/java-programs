class inp
{
public static void main(String aa[]) throws java.io.IOException
{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("Enter the Number for Square : " );
String str=br.readLine();
int x=Integer.parseInt(str);
System.out.println("The Square of the number are : " + (x*x));
}
}