import java.util.Scanner;

public class Lection7DZ10 {
    public static void main(String[] args) {
        authentic();
    }
    public static void authentic () {
        Scanner in = new Scanner(System.in);
        String a = "user";
        String b = "qwerty";
        String c = "Authentication completed!";
        String d = "Invalid login or password.";
        System.out.println("Insert login: ");
        String a1 = in.next();
        System.out.println("Insert password: ");
        String b1 = in.next();
        if (a1.equals(a) && b1.equals(b)) {
            System.out.println(c);
        }
        else System.out.println(d);
    }
}
