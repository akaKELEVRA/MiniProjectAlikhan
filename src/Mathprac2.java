import java.util.Scanner;
public class Mathprac2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert first number:");
        int a = in.nextInt();
        System.out.println("Insert second number:");
        int b = in.nextInt();
        System.out.println("Insert third number");
        int c = in.nextInt();
        int res1 = a * 2;
        int res2 = b - 3;
        int res3 = c * c;
        int t1 = (res1 + res2 + res3);
        String t2 = "Total = ";
        System.out.println();
        System.out.println(t2+t1);
        System.out.println();
        System.out.println("Insert first number:");
        int a1 = in.nextInt();
        System.out.println("Insert second number:");
        int b1= in.nextInt();
        System.out.println("Insert third number");
        int c1 = in.nextInt();
        int res4 = a1 * 2;
        int res5 = b1 - 3;
        int res6 = c1 * c1;
        int t3 = (res4 + res5 + res6);
        System.out.println();
        System.out.println(t2+t3);
    }
}