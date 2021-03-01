import java.util.Scanner;

public class Lection7DZ3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите произвольное число: ");
        int a = in.nextInt();
        System.out.print("Делится ли заданное число на 2 без остатка: " + divisible(a));
    }
    public static String divisible (int a) {
        String y = "Yes";
        String n = "No";
        String w;
        if (a%2 == 0) {
            w=y;
        }
        else {
            w=n;
        }
        return w;
    }
}
