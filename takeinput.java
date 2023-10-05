class Hi
{
public static void main(String a[]) throws java.io.IOException
{	
	java.io.InputStreamReader is= new java.io.InputStreamReader(System.in);
	java.io.BufferedReader bf= new java.io.BufferedReader(is);
	System.out.print("Enter the Text : " );
	String s=bf.readLine();
	System.out.print("The Entere Text  : " + s);
}
}
