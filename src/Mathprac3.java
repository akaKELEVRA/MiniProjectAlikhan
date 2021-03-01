import java.util.Scanner;
public class Mathprac3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert temperature:");
        int tc = in.nextInt();
        double a = 1.8;
        double tf = a * tc + 32;
        String name = "Fahrenheit = ";
        System.out.println();
        System.out.println(name+tf);
        System.out.println();
        System.out.println("Insert temperature:");
        int tc1 = in.nextInt();
        double tf1 = a * tc1 + 32;
        System.out.println();
        System.out.println(name+tf1);
    }
}
