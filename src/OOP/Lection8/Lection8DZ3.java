package OOP.Lection8;

import java.util.Scanner;

public class Lection8DZ3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Student [] arrstud = new Student[1000];
        arrstud [0] = new Student(1, "Alikhan", "Mussurmanov", 3.8);
        arrstud [1] = new Student(2, "Dinara", "Shaikhiyeva", 4);
        arrstud [2] = new Student(3, "Zhazira", "Shaikhiyeva", 3.9);
        arrstud [3] = new Student(4, "Baurzhan", "Abdugali", 3.8);
        arrstud [4] = new Student(5, "Assel", "Alikhan", 3);
        arrstud [5] = new Student(6, "Larisa", "Ten", 3.2);
        arrstud [6] = new Student(7, "Olesya", "Li", 3.7);
        arrstud [7] = new Student(8, "Stas", "Ogorodov", 2.9);
        arrstud [8] = new Student(9, "Aybol", "Nurmaganbetov", 3.75);
        arrstud [9] = new Student(10, "Timur", "Tamashev", 3.65);
        int index = 10;
        while (true) {
            System.out.println("Нажмите [1] чтобы добавить данные нового студента");
            System.out.println("Нажмите [2] для просмотра актуального списка студентов");
            System.out.println("Нажмите [0] для выхода из программы");
            String ch = in.next();
            if (ch.equals("1")) {
                System.out.println();
                System.out.print("Введите id для нового студента в консоли: ");
                int id = in.nextInt();
                System.out.print("Введите имя в консоли: ");
                String name = in.next();
                System.out.print("Введите фамилию в консоли: ");
                String surname = in.next();
                System.out.print("Введите значение GPA в консоли: ");
                double gpa = in.nextDouble();
                arrstud[index] = new Student(id, name, surname, gpa);
                index++;
                System.out.println("Данные " + name + " " + surname + " введены");
            }
            if (ch.equals("2")) {
                System.out.println();
                for (int i=0; i<index; i++) {
                    System.out.println(arrstud[i].getStudentData());
                }
            }
            if (ch.equals("0")) {
                System.out.println("Выход из программы ...");
                break;
            }
        }
    }
}
