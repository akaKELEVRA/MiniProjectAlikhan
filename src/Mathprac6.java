import java.util.Scanner;
public class Mathprac6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert x:");
        double x = in.nextDouble();
        System.out.println("Insert y:");
        double y = in.nextDouble();
        System.out.println("Insert z:");
        double z = in.nextDouble();
        double a = Math.pow(x,4);
        double b = Math.pow(y,2);
        double c = 4 * x * b;
        double d = 4 * y * z;
        double e = Math.pow(z,4);
        String res = "x^4 + 4*x*y^2 - 4*y*z + z^4 = ";
        System.out.println();
        System.out.println(res+(a+c-d+e));
        System.out.println();
        System.out.println("Insert next x:");
        double x1 = in.nextDouble();
        System.out.println("Insert next y:");
        double y1 = in.nextDouble();
        System.out.println("Insert next z:");
        double z1 = in.nextDouble();
        double a1 = Math.pow(x1,4);
        double b1 = Math.pow(y1,2);
        double c1 = 4 * x1 * b1;
        double d1 = 4 * y1* z1;
        double e1 = Math.pow(z1,4);
        String res1 = "x^4 + 4*x*y^2 - 4*y*z + z^4 = ";
        System.out.println();
        System.out.println(res1+(a1+c1-d1+e1));
    }
}
