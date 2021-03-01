import java.util.Scanner;

public class Lection6DZ11 {
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
        for (int i=0; i<arr.length; i++) {
            int sum = 0;
            for (int j=0; j<arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Сумма элементов " + i + "-й строки двумерного массива = " + sum);
        }
    }
}
