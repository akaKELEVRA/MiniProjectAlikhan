import java.util.Scanner;

public class Lection7prac2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        metod(11);
        metod(5);
        metod(8);
        System.out.println("Command 1");
        System.out.println("Command 2");
        metod(4);
        metod(9);
    }

    public static void metod(int n) {
        for (int i=1; i<=n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

//  1 2 3 4 5 6 7 8 9 10 11;
//  1 2 3 4 5;
//  1 2 3 4 5 6 7 8;
