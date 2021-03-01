import java.util.Scanner;
public class Mathprac4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert number:");
        int a = in.nextInt();
        System.out.println("Insert second number");
        int b = in.nextInt();
        System.out.println("Insert third number");
        int c = in.nextInt();
        int e = c - a;
        int f = a + b + c;
        a = a + b;
        b = e;
        c = f;
        String a1 = "a = ";
        String b1 = "b = ";
        String c1 = "c = ";
        System.out.println(a1 + a);
        System.out.println(b1 + b);
        System.out.println(c1 + c);
        System.out.println();
        System.out.println("Insert number:");
        int a2 = in.nextInt();
        System.out.println("Insert second number");
        int b2 = in.nextInt();
        System.out.println("Insert third number");
        int c2 = in.nextInt();
        int e1 = c2 - a2;
        int f1 = a2 + b2 + c2;
        a2 = a2 + b2;
        b2 = e1;
        c2 = f1;
        String a3 = "a = ";
        String b3 = "b = ";
        String c3 = "c = ";
        System.out.println(a3 + a2);
        System.out.println(b3 + b2);
        System.out.println(c3 + c2);
    }
}
