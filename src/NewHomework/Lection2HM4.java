package NewHomework;

import java.util.Scanner;

public class Lection2HM4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        if (n <= 2019) {
            System.out.println("No");
        }
        else if (n >= 2021) {
            System.out.println("Yes");
        }
        else if (n == 2020) {
            System.out.println("Error");
        }
    }
}
