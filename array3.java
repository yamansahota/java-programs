public class array3 {
    public static void main(String[] args) {
        int arr1[][];

        arr1=new int[2][4];
        // arr1[0]=new int[4];
        // arr1[1]=new int[4];

        arr1[0][0]=10;
        arr1[0][1]=20;
        arr1[0][2]=30;
        arr1[0][3]=40;

        arr1[1][0]=50;
        arr1[1][1]=60;
        arr1[1][2]=70;
        arr1[1][3]=80;

        for(int x:arr1[0])
        {
            System.out.println(x);
        }
        for(int x:arr1[1])
        {
            System.out.println(x);
        }
    }

}
