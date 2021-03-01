import java.util.Scanner;

public class Lection7DZ4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String s = in.next();
        duplication(s);
    }
    public static void duplication (String s) {
        for (int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(i) + "" + s.charAt(i));
        }
        System.out.println();
    }
}
