import java.util.Scanner;
public class Mathprac7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert x:");
        double x = in.nextDouble();
        System.out.println("Insert y:");
        double y = in.nextDouble();
        System.out.println("Insert z:");
        double z = in.nextDouble();
        double a = Math.pow(x,3);
        double b = Math.pow(z,3);
        double c = 5 * x * y;
        double d = 6 * z * y;
        String res = "x^3 + 5*x*y - 6*z*y + z^3 = ";
        System.out.println();
        System.out.println(res + (a+c-d+b));
        System.out.println("Insert next x:");
        double x1 = in.nextDouble();
        System.out.println("Insert next y:");
        double y1 = in.nextDouble();
        System.out.println("Insert next z:");
        double z1 = in.nextDouble();
        double a1 = Math.pow(x1,3);
        double b1 = Math.pow(z1,3);
        double c1 = 5 * x1 * y1;
        double d1 = 6 * z1 * y1;
        String res1 = "x^3 + 5*x*y - 6*z*y + z^3 = ";
        System.out.println();
        System.out.println(res1 + (a1+c1-d1+b1));
    }
}
