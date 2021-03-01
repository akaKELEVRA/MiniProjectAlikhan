import java.util.Scanner;
public class Mathprac8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert L:");
        int ls = in.nextInt();
        int lm= ls/100;
        System.out.println("L = " + lm + "m");
        System.out.println();
        System.out.println("Insert next L:");
        int ls1 = in.nextInt();
        int lm1 = ls1/100;
        System.out.println("L = " + lm1 + "m");
    }
}
