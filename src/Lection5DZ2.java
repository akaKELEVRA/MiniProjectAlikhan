import java.util.Scanner;

public class Lection5DZ2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String a = scan.next();
        System.out.print("Первый символ текста: " + a.charAt(0));
    }
}
