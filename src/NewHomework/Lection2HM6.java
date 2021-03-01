package NewHomework;

import java.util.Scanner;

public class Lection2HM6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        if (a>100 || a<-100) {
            a = 0;
            System.out.println(a);
        }
        else {
            a = a+1;
            System.out.println(a);
        }
    }
}
