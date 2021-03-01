import java.util.Scanner;

public class Lection5DZ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String a = in.next();
        System.out.print("Введите букву: ");
        String b = in.next();
        int c = a.indexOf(b);
        if (c>=0) {
            System.out.println();
            System.out.println("Индекс буквы = " + c);
        }
        else {
            System.out.println();
            System.out.println("There is not such letter");
        }
    }
}
