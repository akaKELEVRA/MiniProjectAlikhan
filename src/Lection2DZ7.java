import java.util.Scanner;
public class Lection2DZ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.println();
        if (a%b == 0) {
            System.out.println("divisible");
        }
        else System.out.println("not divisible");
    }
}
