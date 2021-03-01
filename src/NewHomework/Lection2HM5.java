package NewHomework;

import java.util.Scanner;

public class Lection2HM5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String a = in.next();
        String b = "День недели - ";
        if (a.equals("1")) {
            System.out.println(b + "Понедельник");
        }
        else if (a.equals("2")) {
            System.out.println(b + "Вторник");
        }
        else if (a.equals("3")) {
            System.out.println(b + "Среда");
        }
        else if (a.equals("4")) {
            System.out.println(b + "Четверг");
        }
        else if (a.equals("5")) {
            System.out.println(b + "Пятница");
        }
        else if (a.equals("6")) {
            System.out.println(b + "Суббота");
        }
        else if (a.equals("7")) {
            System.out.println(b + "Воскресенье");
        }
    }
}
