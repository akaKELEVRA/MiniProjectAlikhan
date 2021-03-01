import java.util.Scanner;

public class Lection6prac3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] arr = new int [2][n];
        for (int i=0; i<2; i++) {
            for (int j=0; j<n; j++) {
                n = in.nextInt();
            }
        }
        boolean b = true;
        for (int i=0; i<2; i++) {
            if (arr[0][i] != arr[1][i]) {
                b = false;
            }
        }
        if(b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
