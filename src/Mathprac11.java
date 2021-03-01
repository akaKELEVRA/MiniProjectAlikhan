import java.util.Scanner;
public class Mathprac11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите диаметр окружности d:");
        int d = in.nextInt();
        double pi = 3.14;
        double L = pi * d;
        String res = "d = ";
        System.out.println(res+L);
        System.out.println();
        System.out.println("Введите диаметр окружности d:");
        int d1 = in.nextInt();
        double pi1 = 3.14;
        double L1 = pi1 * d1;
        System.out.println(res+L1);
    }
}
