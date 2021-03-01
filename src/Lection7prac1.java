import java.util.Scanner;

public class Lection7prac1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        metod();
        metod();
        metod();
        System.out.println("Command 1");
        System.out.println("Command 2");
        metod();
        metod();
    }

    public static void metod() {
        for (int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

//  1 2 3 4 5 6 7 8 9 10;
//  1 2 3 4 5 6 7 8 9 10;
//  1 2 3 4 5 6 7 8 9 10;
