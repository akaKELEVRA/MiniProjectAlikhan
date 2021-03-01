import java.util.Scanner;

public class Lection5DZ14 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s1 = in.next();
        System.out.print("Введите второе слово: ");
        String s2 = in.next();
        int a = s1.indexOf(s2);
        if (a>=0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}