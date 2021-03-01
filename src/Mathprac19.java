import java.util.Scanner;
public class Mathprac19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a:");
        int a = in.nextInt();
        System.out.println("Введите значение b:");
        int b = in.nextInt();
        System.out.println("Введите значение c:");
        int c = in.nextInt();
        int d = b-a;
        int e = c-b;
        int f = c-a;
        boolean m = (a>=e) && (b>=f) && (c>=d);
        System.out.println(m);
    }
}
