import java.util.Scanner;

public class Lection6DZ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        int[][] arr = new int[2][n];
//        int m = in.nextInt();
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < n; j++) {
//                n = in.nextInt();
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Введите значение для [" + i + "][" + j + "]");
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

