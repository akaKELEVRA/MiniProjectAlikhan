import java.util.Scanner;
public class Lection3DZ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение n: ");
//        int n = in.nextInt();
//        int m = 1;
//        int fact = m*n*(n+1);
//        System.out.print("Произведение n чисел = ");
//        while (m<=n) {
//            m++;
//        }
//        System.out.println(fact);
        int n = in.nextInt();
        int m = 1;
        for (int i = 1; i <= n; i++) {
            m = m * i;
        }
        System.out.println("Произведение n чисел = "+m);
    }
}
