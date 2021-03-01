package NewHomework;

import java.util.Scanner;

public class Lection2HM10 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третье число: ");
        int c = in.nextInt();
        System.out.println("Введите четвертое число: ");
        int d = in.nextInt();
        int evenmax = 0;
        String max = "Маскимальное четное число = ";
        if (a>b && a>c && a>d && b>c && b>d && c>d) {
            evenmax = a;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (a>b && a>c && a>d && b>c && b>d && d>c) {
            evenmax = a;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (a>b && a>c && a>d && c>b && c>d && b>d) {
            evenmax = a;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (a>b && a>c && a>d && c>b && c>d && d>b) {
            evenmax = a;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (a>b && a>c && a>d && d>b && d>c && b>c) {
            evenmax = a;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (a>b && a>c && a>d && d>b && d>c && c>b) {
            evenmax = a;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (b>a && b>c && b>d && a>c && a>d && c>d) {
            evenmax = b;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (b>a && b>c && b>d && a>c && a>d && d>c) {
            evenmax = b;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (b>a && b>c && b>d && c>a && c>d && a>d) {
            evenmax = b;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (b>a && b>c && b>d && c>a && c>d && d>a) {
            evenmax = b;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (c>a && c>b && c>d && a>b && a>d && b>d) {
            evenmax = c;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
        if (d>a && d>b && d>c && a>b && a>c && b>c) {
            evenmax = d;
            if(evenmax%2 == 0) {
                System.out.println(max + evenmax);
            }
            else {
                System.out.println("Not Found!");
            }
        }
    }
}
