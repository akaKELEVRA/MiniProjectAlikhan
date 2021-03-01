import java.util.Scanner;
public class Lection3DZ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert n:");
        int n = in.nextInt();
        int m = 1;
        while (m<=n) {
            System.out.println(m +" "+ (int) Math.pow(m,2));
            m++;
        }
    }
}
