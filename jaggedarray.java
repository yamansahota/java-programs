
public class jaggedarray {
	public static void main(String[] args) {
		int a[][][];
		a = new int[2][2][3];
		// int a[0]=new int [2];
		// int a[1]=new int [3];
		// a[0][0]=10;
		// a[0][1]=20;

		// a[1][0]=100;
		// a[1][1]=200;
		// a[1][2]=300;
		for (int x[] : a[1]) {
			System.out.println(x);
		}
	}

}