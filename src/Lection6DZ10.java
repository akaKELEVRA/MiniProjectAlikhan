import java.util.Scanner;

public class Lection6DZ10 {
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
        int sum = 0;
        String a = "Сумма элементов с нечетными индексами = ";
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (i%2 != 0 && j%2 != 0) {
                    sum = sum + arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(a+sum);
    }
}
