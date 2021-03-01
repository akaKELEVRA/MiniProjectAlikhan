package Lection14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pie = 100;
        int result = 0;
        try {
            int person = in.nextInt();
            result = pie/person;
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
            result = 1;
        }
        catch (ArithmeticException e) {
            System.out.println("Division by ZERO");
            result = 0;
        }
        System.out.println("Каждому кусков пирога: " + result);
        System.out.println("Program finished");
    }
}
