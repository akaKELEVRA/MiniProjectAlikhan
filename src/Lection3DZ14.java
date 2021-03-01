import java.util.Scanner;

public class Lection3DZ14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert n: ");
        int n = in.nextInt();
        int m = 1;
//        int a = (n * (n+1))/2;
        double a = Math.pow(n,2);
        String sum = "Сумма первых n чисел последовательности: ";
        while (m<=n) {
            m++;
        }
        System.out.println(sum + (int)a);
    }
}
