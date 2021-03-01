import java.util.Scanner;

public class Lection3DZ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        double a = in.nextDouble();
        double b = 1;
        String comp = "Произведение чисел = ";
        while (a != 0) {
            b = b*a;
            a = in.nextDouble();
        }
        System.out.println(comp+b);
    }
}
