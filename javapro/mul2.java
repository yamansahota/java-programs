package pk1;
class sec
{
	void he()
	{
	System.out.println("Function he() of the pk1 package of second file");
	}
}

class third
{
public static void main(String a[])
	{
	System.out.println("Content of the another file ");
	sec obj=new  sec();
	obj.he();
	}
}

