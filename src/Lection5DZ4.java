import java.util.Scanner;

public class Lection5DZ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "java";
        System.out.print("Введите текст: ");
        String b = in.next();
        if (b.equalsIgnoreCase(a)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
