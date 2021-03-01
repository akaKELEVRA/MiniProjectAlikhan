import java.util.Scanner;

public class Lection7DZ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String s = in.nextLine();
        System.out.println("Введите второе слово: ");
        String s1 = in.nextLine();
        int a = s.indexOf(s1);
        content(a);
    }
    public static void content (int a) {
        if (a>=0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
