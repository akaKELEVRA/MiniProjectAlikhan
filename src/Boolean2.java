import java.util.Scanner;
public class Boolean2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Insert number:");
        int a1 = in.nextInt();
        System.out.println("Insert next number:");
        int b1 = in.nextInt();
        a = a1;
        b = b1;
        boolean e = a>b;
        String c = "Result: ";
        System.out.println(c + e);
        System.out.println();
        int a2;
        int b2;
        System.out.println("Insert number:");
        int a3 = in.nextInt();
        System.out.println("Insert next number:");
        int b3 = in.nextInt();
        a2 = a3;
        b2 = b3;
        boolean e1 = a2>b2;
                System.out.println(c + e1);
    }
}
