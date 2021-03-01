package Lection14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        User [] users = new User[5];
        int age = 0;
        for (int i=0; i<users.length; i++) {
            System.out.println("Insert name for user " + i);
            String name = in.next();
            System.out.println("Insert surname for user " + i);
            String surname = in.next();
            System.out.println("Insert age for user " + i);
            try {
                age = in.nextInt();
            }
            catch (Exception e) {
                in.next();
                System.out.println("Wrong input");
                age = 0;
            }
            users[i] = new User(name, surname, age);
        }
        for (int i=0; i<5; i++) {
            System.out.println(users[i]);
        }
    }
}
