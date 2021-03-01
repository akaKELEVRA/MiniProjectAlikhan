import java.util.Scanner;
public class Mathprac12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение радиуса окружности R:");
        int rad = in.nextInt();
        double pi = 3.14;
        double sqR = Math.pow(rad,2);
        double L = 2 * pi * rad;
        double S = pi * sqR;
        String res1 = "L = ";
        String res2 = "S = ";
        System.out.println();
        System.out.println(res1+L);
        System.out.println(res2+S);
        System.out.println();
        System.out.println("Введите второе значение радиус окружности R:");
        int rad1= in.nextInt();
        double pi1 = 3.14;
        double sqR1 = Math.pow(rad1,2);
        double L1 = 2 * pi1 * rad1;
        double S1 = pi * sqR1;
        System.out.println();
        System.out.println(res1+L1);
        System.out.println(res2+S1);
    }
}
