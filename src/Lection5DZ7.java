import java.util.Scanner;

public class Lection5DZ7 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String a = in.nextLine();
        char ch = '(';
        char ch2 = ')';
        System.out.println(ch+a.trim()+ch2);
    }
}
