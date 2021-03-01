import java.util.Scanner;

public class Lection5DZ30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s1 = in.next();
        for (int i=0; i<s1.length(); i++) {
            System.out.println(s1.length()-1-i);
        }

    }
}
