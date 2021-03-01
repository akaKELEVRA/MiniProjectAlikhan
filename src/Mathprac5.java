import java.util.Scanner;
public class Mathprac5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert a:");
        double a = in.nextDouble();
        System.out.println("Insert b:");
        double b = in.nextDouble();
        System.out.println("Insert c:");
        double c = in.nextDouble();
        double d = Math.pow(a,3);
        double e = 2 * Math.pow(b,2);
        double f = 3 * a * b;
        double g = Math.pow(c,3);
        String res = "a^3 + 2*b^2 - 3*a*b + c^3 = ";
        System.out.println();
        System.out.println(res + (d+e-f+g));
        System.out.println();
        System.out.println("Insert next a:");
        double a1 = in.nextDouble();
        System.out.println("Insert next b");
        double b1 = in.nextDouble();
        System.out.println("Insert next c:");
        double c1 = in.nextDouble();
        double d1 = Math.pow(a1,3);
        double e1 = 2 * Math.pow(b1,2);
        double f1 = 3 * a1 * b1;
        double g1 = Math.pow(c1,3);
        String res1 = "a^3 + 2*b^2 - 3*a*b + c^3 = ";
        System.out.println();
        System.out.println(res1 + (d1+e1-f1+g1));
    }
}
