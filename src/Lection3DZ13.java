import java.util.Scanner;

public class Lection3DZ13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert n: ");
        int n = in.nextInt();
        int m = 1;
        double sumsqr = (n * (n+1) * (2*n + 1))/6;
        String sum = "sum 1^2 + 2^2 + ... + n^2 = ";
        while (m<=n) {
            m++;
        }
        System.out.println();
        System.out.println(sum+sumsqr);
    }
}
