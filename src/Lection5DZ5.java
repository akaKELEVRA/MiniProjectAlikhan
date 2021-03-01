import java.util.Scanner;

public class Lection5DZ5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String a = in.next();
        System.out.print("Введите второе слово: ");
        String b = in.next();
        if (b.equalsIgnoreCase(a)) {
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are not equal");
        }
    }
}
