import java.util.Scanner;

public class Lection5DZ8 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 0 до 9 в виде текста: ");
        String a = in.next();
        int b = Integer.parseInt(a);
        System.out.println(b);
    }
}
