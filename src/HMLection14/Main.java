package HMLection14;

import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        User [] users = new User[5];
        int age = 0;
        int sum = 0;
        int average = 0;
        for (int i=0; i< users.length; i++) {
            System.out.println("Введите имя для пользователя № " + i + ":");
            String name = in.next();
            System.out.println("Введите фамилию пользователя № " + i + ":");
            String surname = in.next();
            System.out.println("Введите возраст пользователя № " + i + ":");
            try {
                age = in.nextInt();
            }
            catch (Exception e) {
                in.next();
                System.out.println("Неверный формат ввода!");
                age = 0;
            }
            users[i] = new User(name, surname, age);
            sum = sum + users[i].age;
        }
        for (int i=0; i< users.length; i++) {
            System.out.println(users[i]);
        }
        System.out.println("Сумма всех возрастов пользователей = " + sum);
        System.out.println("Средний значение возраста пользователей =  " + (average = sum / users.length));
    }
}
