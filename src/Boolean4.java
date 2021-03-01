import java.util.Scanner;
public class Boolean4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Insert number:");
        int a1 = in.nextInt();
        System.out.println("Insert next number");
        int b1 = in.nextInt();
        System.out.println("Insert next number");
        int c1 = in.nextInt();
        a = a1;
        b = b1;
        c = c1;
        boolean d = a<b;
        boolean e = b<c;
        boolean f = d&&e;
        String res = "Result: ";
        System.out.println();
        System.out.println(res + f);
        System.out.println();
        int a2;
        int b2;
        int c2;
        System.out.println("Insert number:");
        int a3 = in.nextInt();
        System.out.println("Insert next number");
        int b3 = in.nextInt();
        System.out.println("Insert next number");
        int c3 = in.nextInt();
        a2 = a3;
        b2 = b3;
        c2 = c3;
        boolean d1 = a2<b2;
        boolean e1 = b2<c2;
        boolean f1 = d1&&e1;
        System.out.println();
        System.out.println(res + f1);
    }
}
