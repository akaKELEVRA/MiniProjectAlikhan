import java.util.Scanner;

public class Lection7prac3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = 0;
        s = method(3,11);
        System.out.println("Сумма = " + s);
        s = method(4,5);
        System.out.println("Сумма = " + s);
        int a = method(2,8);
        System.out.println("Сумма = " + a);
        System.out.println("Command 1");
        System.out.println("Command 2");
        method(2,4);
        method(1,9);
    }

    public static int method(int n, int m) {
        int sum = 0;
        for (int i=n; i<=m; i++) {
            sum = sum + i;
        }
        System.out.println();
        return sum;
    }
}

//  1 2 3 4 5 6 7 8 9 10 11;
//  1 2 3 4 5;
//  1 2 3 4 5 6 7 8;
