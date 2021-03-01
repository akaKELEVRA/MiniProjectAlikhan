import java.util.Scanner;
public class Mathprac10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int a = in.nextInt();
        int e1 = a % 10;
        int e2 = a % 100 / 10;
        System.out.println("Последняя цифра числа (единицы) " + e1);
        System.out.println("Предпоследняя цифра числа (десятки) " + e2);
    }
}
