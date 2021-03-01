import java.util.Scanner;
public class Lection2DZ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение n:");
        int n1 = in.nextInt();
        System.out.println("Введите значение n:");
        int n2 = in.nextInt();
        if (n1 > n2) {
            System.out.println("Большее число: " + n1);
        }
        else System.out.println("Большее число: " + n2);
    }
}
