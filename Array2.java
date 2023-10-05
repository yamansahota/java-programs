class array 
{
	public static void main(String a[])
{
	int arr[][];
	arr=new int[2];
	arr[0]=new int[4];
	arr[1]=new int[4];

	arr[0][0]=10;
	arr[0][1]=20;
	arr[0][2]=30;
	arr[0][3]=40;
	arr[0][4]=50;

	arr[1][0]=100;
	arr[1][1]=200;
	arr[1][2]=300;
	arr[1][3]=400;
	arr[1][4]=500;

for (int x:arr[0])
{
 System.out.println(x);
}
}
}