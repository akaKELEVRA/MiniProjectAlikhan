package NewHomework;

import java.util.Scanner;

public class Lection2HM9 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третье число: ");
        int c = in.nextInt();
        int min = 0;
        if (a>b && a>c && b>c) {
            min = c;
            System.out.println("Максимальное число = " + min);
        }
        else if (b>a && b>c && c>a) {
            min = a;
            System.out.println("Максимальное число = " + min);
        }
        else if (b>a && c>b && c>a) {
            min = a;
            System.out.println("Максимальное число = " + min);
        }
        else if (a>b && c>b && a>c) {
            min = b;
            System.out.println("Максимальное число = " + min);
        }
        else if (a>b && c>b && c>a) {
            min = b;
            System.out.println("Максимальное число = " + min);
        }
        else if (b>a && a>c && b>c) {
            min = c;
            System.out.println("Максимальное число = " + min);
        }
    }
}
