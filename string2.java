class st1
{
	public static void main(String a[])
{
	StringBuffer st=new StringBuffer("Hello");
	StringBuffer st2= new StringBuffer("Hello");
	System.out.println(st==st2);
	System.out.println(st.equals(st2));

	System.out.println(st.length());	System.out.println(st2.capacity());

	

	String s=new String("Hello");
	String sa=new String("Hello");

	System.out.println(s.length());
		System.out.println(s.toLowerCase());

	System.out.println(s==sa);
	System.out.println(s.equals(sa));
	
}
}
