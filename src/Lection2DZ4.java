import java.util.Scanner;
public class Lection2DZ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = in.nextInt();
        System.out.println("Введите число b:");
        int b = in.nextInt();
        System.out.println("Введите число c:");
        int c = in.nextInt();
        int d = a - b;
        int e = b - c;
        int f = a - c;
        int g = b - a;
        int h = c - b;
        int i = c - a;
        System.out.println();
        if (a>e && b>f && c>d && a>h && b>i && c>g) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
