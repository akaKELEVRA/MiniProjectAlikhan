import java.util.Scanner;

public class Lection6DZ14 {
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
        int max = arr[0][0];
        int min = arr[0][0];
        int temp = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    temp = min;
                    min = max;
                }
                if (arr[i][j]>max) {
                    max = arr[i][j];
                    max = temp;
                }
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}

