import java.util.Scanner;

public class Lection6DZ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = {
                {12, 5, 7, 6},
                {4, 0, 2, 7},
                {9, 1, 3, 2},
                {10, -2, 4, 6}
        };
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        System.out.print("Введите число m: ");
        int m = in.nextInt();
        System.out.println(arr[n][m]);
//        for (int i=0; i<arr.length; i++) {
//            for (int j=0; j<arr[i].length; j++) {
//                System.out.println(arr[n][m]);
//            }
//            System.out.println();
//        }

    }
}
