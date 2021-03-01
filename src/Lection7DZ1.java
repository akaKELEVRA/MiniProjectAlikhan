import java.util.Scanner;

public class Lection7DZ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три произвольных целых числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Максимальное число из введенных = " + maximum(a,b,c));
    }
    public static int maximum (int a, int b, int c) {
        int max=0;
        if (max<a) {
            max = a;
            }
        else if (max<b) {
            max = b;
        }
        else if (max<c) {
            max = c;
        }
        return max;
    }
}
