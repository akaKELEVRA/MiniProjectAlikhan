import java.util.Scanner;

public class Lection6prac2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] nums = new int [n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.println("Введите значение для ["+i+"]["+j+"]");
                nums [i][j] = in.nextInt();
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
