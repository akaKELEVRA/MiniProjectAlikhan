import java.util.Scanner;

public class Lection7DZ16 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = in.nextInt();
        System.out.print("Введите значение m: ");
        int m = in.nextInt();
        int [][] arr = new int [n][m];
        method(n,m,arr);
    }
    public static void method (int n, int m, int [][] arr) {
        Scanner in = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Введите значение для [" + i + "][" + j + "]");
                arr[i][j] = in.nextInt();
            }
            System.out.println();
        }
        int max = arr[0][0];
        for (int i=0; i<n; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j]>max) {
                    max = arr[i][j];
                    System.out.println("max = " + max);
                }
            }
        }
    }
}
