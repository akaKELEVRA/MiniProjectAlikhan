package NewHomework;

import java.util.Scanner;

public class Lection2HM8 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третье число: ");
        int c = in.nextInt();
        int max = 0;
        if (a>b && a>c && b>c) {
            max = a;
            System.out.println("Максимальное число = " + max);
        }
        else if (b>a && b>c && c>a) {
            max = b;
            System.out.println("Максимальное число = " + max);
        }
        else if (b>a && c>b && c>a) {
            max = c;
            System.out.println("Максимальное число = " + max);
        }
        else if (a>b && c>b && a>c) {
            max = a;
            System.out.println("Максимальное число = " + max);
        }
        else if (a>b && c>b && c>a) {
            max = c;
            System.out.println("Максимальное число = " + max);
        }
        else if (b>a && a>c && b>c) {
            max = b;
            System.out.println("Максимальное число = " + max);
        }
    }
}
