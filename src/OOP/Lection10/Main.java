package OOP.Lection10;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        User [] memory = new User[1000];
        int sizeOfUsers = 0;
        while (true) {
            System.out.println("Введите [1] для ввода нового пользователя:");
            System.out.println("Введите [2] для просмотра актуального списка пользователей:");
            System.out.println("Введите [3] для вывода списка пользователей по их индексам:");
            System.out.println("Введите [0] для выхода из программы:");
            String genchoice = in.next();
            if (genchoice.equals("1")) {
                System.out.println("Введите [1] для ввода данных нового студента:");
                System.out.println("Введите [2] для ввода данных нового преподавателя:");
                String ch1 = in.next();
                if (ch1.equals("1")) {
                    System.out.println("Введите логин:");
                    String studlog = in.next();
                    System.out.println("Введите пароль:");
                    String studpass = in.next();
                    System.out.println("Введите имя:");
                    String studname = in.next();
                    System.out.println("Введите фамилию:");
                    String studsurn = in.next();
                    System.out.println("Введите группу:");
                    String studgpoup = in.next();
                    System.out.println("Введите GPA:");
                    double gpa = in.nextDouble();
                    Student studs = new Student (1, "", "", "name", "surname", "group", 4);
                    }
                if (ch1.equals("2")) {
                    System.out.println("Введите логин:");
                    String teachlog = in.next();
                    System.out.println("Введите пароль:");
                    String teachpass = in.next();
                    System.out.println("Введите никнейм:");
                    String teachnick = in.next();
                    System.out.println("Введите положение:");
                    String teachstat = in.next();
                    Teacher teachers = new Teacher (11, "log11", "pass11", "DI", "Accountant");
                    while (true) {
                        System.out.println("Введите [1] для ввода данных нового предмета:");
                        System.out.println("Введите [0] для завершения ввода предметов:");
                        String subjch = in.next();
                        if (subjch.equals("1")) {
                            System.out.println("Введите название предмета:");
                            String subj = in.next();
                            teachers.addSubject(subj);
                        }
                        if (subjch.equals("0")) {
                            break;
                        }
                        memory[sizeOfUsers] = teachers;
                        sizeOfUsers++;
                    }
                }

            }
            if (genchoice.equals("2")) {
                System.out.println("Введите [1] для просмотра актуального списка студентов:");
                System.out.println("Введите [2] для просмотра актуального списка преподавателей:");
                String ch2 = in.next();
                if (ch2.equals("1")) {
                    for (int i=0; i<sizeOfUsers; i++) {
                        if (memory[i] instanceof Student) {
                            System.out.println(memory[i].getUserData());
                        }
                        if (memory[i] instanceof Teacher) {
                            System.out.println(memory[i].getUserData());
                        }
                    }
                }
            }
            if (genchoice.equals("3")) {
                System.out.println("Введите индекс пользователя: ");
                int userindex = in.nextInt();
                for (int i=0; i< memory.length; i++) {
                    if (userindex == i) {
                        System.out.println(memory[i]);
                    }
                    else {
                        System.out.println("No user in this index");
                    }
                }
            }
            if (genchoice.equals("0")) {
                break;
            }
        }

    }
}

