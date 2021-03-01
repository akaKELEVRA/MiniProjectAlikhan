package Lection14;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        try {
            int a = in.nextInt();
            result = a * a;
        } catch (Exception e){
            System.out.println("Wrong input ");
            result = 1;
        }
        System.out.println("Square of a is " + result);
        System.out.println("Program finished");
    }
}
