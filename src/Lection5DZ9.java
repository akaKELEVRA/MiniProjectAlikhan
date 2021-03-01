import java.util.Scanner;

public class Lection5DZ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = in.next();
        for (int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
