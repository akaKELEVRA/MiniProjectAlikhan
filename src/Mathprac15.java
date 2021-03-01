import java.util.Scanner;
public class Mathprac15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = in.nextInt();
        double y = 3*Math.pow(x,2) - 6*x - 7;
        System.out.println();
        String a = "y = 3*x^2 - 6*x - 7 = ";
        System.out.println(a + y);
    }
}
