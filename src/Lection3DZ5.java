import java.util.Scanner;
public class Lection3DZ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert n:");
        int n = in.nextInt();
        int m = 1;
        int a = (n*(n+1))/2;
        String sum = "Сумма первых чисел = ";
        System.out.println(sum);
        while (m<=n) {
            m++;
        }
        System.out.println(a);
    }
}
