import java.util.Scanner;
public class Lection2DZ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение зарлаты первого сотрудника: ");
        int a = in.nextInt();
        System.out.println("Введите значение зарлаты второго сотрудника: ");
        int b = in.nextInt();
        System.out.println("Введите значение зарлаты третьего сотрудника: ");
        int c = in.nextInt();
        int d = a - b;
        int e = b - c;
        int f = a - c;
        int g = b - a;
        int h = c - a;
        int i = c - b;
        String res = "Разница в зарплате = ";
        System.out.println();
        if (a<=b && b<=c) {
            System.out.println(res+h);
        } else if (a<=b && b>=c && a<=c) {
            System.out.println(res+g);
        } else if (a>=b && b>=c) {
            System.out.println(res+f);
        } else if (a<=b && b>=c && a>=c) {
            System.out.println(res+e);
        } else if (a>=b && b<=c && a>=c) {
            System.out.println(res+d);
        } else if (a>=b && b<=c && a<=c) {
            System.out.println(res+i);
        }
    }
}
