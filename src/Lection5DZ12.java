import java.util.Scanner;

public class Lection5DZ12 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s1 = in.next();
        String s2 = s1.replace('a','o');
        System.out.println(s2);
    }
}
