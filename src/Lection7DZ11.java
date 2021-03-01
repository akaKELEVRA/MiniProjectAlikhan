import java.util.Scanner;

public class Lection7DZ11 {
    public static void main(String[] args) {
        authentic();
    }
    public static void authentic () {
        Scanner in = new Scanner(System.in);
        String a = "admin";
        String b = "qwerty";
        String c = "Authentication completed!";
        String d = "Invalid login or password.";
        System.out.print("Insert login: ");
        String a1 = in.nextLine();
        System.out.print("Insert password: ");
        String b1 = in.nextLine();
        if (a1.equals(a) && b1.equals(b)) {
            System.out.println();
            System.out.println(c);
        }
        else {
            System.out.println();
            System.out.println(d);
        }
    }
}