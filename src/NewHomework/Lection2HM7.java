package NewHomework;

import java.util.Scanner;

public class Lection2HM7 {
    public static void main (String[] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        int c = b-a;
        if (c == 100) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
