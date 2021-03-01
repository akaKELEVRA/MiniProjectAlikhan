import java.util.Scanner;

public class Lection7DZ14 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int a = in.nextInt();
        System.out.print("Введите значение b: ");
        int b = in.nextInt();
        int result = 0;
        System.out.println("Результат вычислений = " + arithmetic(a,b,result));
    }
    public static int arithmetic (int a, int b, int result) {
        Scanner in = new Scanner(System.in);
        String ch1 = "+";
        String ch2 = "-";
        String ch3 = "*";
        String ch4 = "/";
        System.out.println("Введите арифметический оператор: ");
        String choice = in.next();
        if (choice.equals(ch1)) {
            result = a+b;
        }
        if (choice.equals(ch2)) {
            result = a-b;
        }
        if (choice.equals(ch3)) {
            result = a*b;
        }
        if (choice.equals(ch4)) {
            result = a/b;
        }
        return result;
    }
}