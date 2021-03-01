import java.util.Scanner;

public class Lection5DZ13 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = in.next();
        char [] reverse = s.toCharArray();
        for (int i=0; i<reverse.length; i++) {
            System.out.print(reverse[reverse.length - 1 - i]);
        }
    }
}
