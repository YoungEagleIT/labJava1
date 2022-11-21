package Laba_1;

public class Task5 {
    public static void main(final String[] args) {
        final int n =3;
        final int m =4;
        final  int [][] arr = new int[n][m];
        create(arr);
        System.out.println("Arr:");
        display(arr);
        final int [][] UpDateArr = new int[m][n];
        transposition(arr,UpDateArr);
        System.out.println("UpDateArr:");
        display(UpDateArr);
    }
    public static void create(final int[][] arr)
    {
        for (int i = 0;i < arr.length;i++)
            for(int j = 0;j<arr[i].length;j++)
                arr[i][j] = (int)(Math.random() * 10);
    }
    public static void display(final int[][] arr)
    {
        for (int i =0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println("\n");
        }


    }
    public  static  void transposition(final int[][] arr,final int[][] UpDateArr)
    {
        for(int i =0;i <arr.length;i++)
            for(int j =0;j <arr[i].length;j++)
                UpDateArr[j][i] = arr[i][j];
    }
}
