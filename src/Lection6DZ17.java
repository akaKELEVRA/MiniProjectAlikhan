import java.util.Scanner;

public class Lection6DZ17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = in.nextInt();
        System.out.print("Введите значение m: ");
        int m = in.nextInt();
        int [][] arr = new int [n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.println("Введите значение для ["+i+"]["+j+"]");
                arr [i][j] = in.nextInt();
            }
            System.out.println();
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[arr.length - 1 - i][j] + " ");
            }
            System.out.println();
        }
    }
}
