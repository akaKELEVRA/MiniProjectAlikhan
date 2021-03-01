import java.util.Scanner;

public class Lection7DZ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три произвольных целых числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String w = "Существует ли треугольник с заданными сторонами: ";
        System.out.println(w+triangle(a,b,c));
    }
    public static String triangle(int a, int b, int c) {
        String w;
        String y = "Yes";
        String n = "No";
        int d = a+b;
        int e = b+c;
        int f = a+c;
        if (d>c == true) {
            w=y;
            }
        else {
            w=n;
            }
        if (e>a == true) {
            w=y;
            }
        else {
            w=n;
            }
        if (f>b == true) {
            w=y;
            }
        else {
            w=n;
        }
        return w;
    }
}
