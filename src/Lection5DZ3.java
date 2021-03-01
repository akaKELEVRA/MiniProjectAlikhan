import java.util.Scanner;

public class Lection5DZ3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "BITLAB";
        System.out.print("Введите текст: ");
        String b = in.next();
        if (b.equals(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
