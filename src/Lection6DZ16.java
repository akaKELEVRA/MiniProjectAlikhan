import java.util.Scanner;

public class Lection6DZ16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        System.out.print("Введите число m: ");
        int m = in.nextInt();
        int [][] arr = new int [n][m];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.println("Введите значение для [" + i + "][" + j + "]");
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print("Введите число k: ");
        int k = in.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if(arr[i][j]%k == 0) {
                    arr[i][j] = arr[i][j] / k;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
