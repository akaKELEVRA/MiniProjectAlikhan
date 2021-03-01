import java.util.Scanner;

public class Lection3DZ9 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert a: ");
        int a = in.nextInt();
        System.out.print("Insert b: ");
        int b = in.nextInt();
        int n = 0;
        while (n <= b) {
            double c = Math.pow(a,n);
            System.out.println(n + " " + (int) c);
            n++;
        }
    }
}
