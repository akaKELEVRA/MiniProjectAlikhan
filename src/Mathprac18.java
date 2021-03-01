import java.util.Scanner;
public class Mathprac18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = in.nextInt();
        int m = a%2;
        boolean b = m==0;
        System.out.println(b);
    }
}
