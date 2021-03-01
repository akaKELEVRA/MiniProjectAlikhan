package OOP.Lection9;

import java.util.Scanner;

public class Lection9DZ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] users = new User[100];
        int indexOfUsers = 10;
        Student stud1 = new Student(11, "", "", "Zhazira", "Shaikhiyeva", 4);
        Student stud2 = new Student(12, "", "", "Baurzhan", "Abdugali", 3.9);
        Student stud3 = new Student(13, "", "", "Aysulu", "Orazbayeva", 3.5);
        Student stud4 = new Student(14, "", "", "Aybol", "Nurmaganbetov", 3.8);
        Student stud5 = new Student(15, "", "", "Timur", "Tamashev", 3.8);
        Staff staf1 = new Staff(21, "", "", "Dinara", "Shaikhiyeva", 1000);
        Staff staf2 = new Staff(22, "", "", "Larisa", "Ten", 800);
        Staff staf3 = new Staff(23, "", "", "Assel", "Alikhan", 700);
        Staff staf4 = new Staff(24, "", "", "Alfiya", "Toxeitova", 800);
        Staff staf5 = new Staff(25, "", "", "Assel", "Koptileuova", 750);
//        User [] users = {stud1, stud2, stud3, stud4, stud5, staf1, staf2, staf3, staf4, staf5};
        while (true) {
            System.out.println("Нажмите [1] для ввода нового пользователя: ");
            System.out.println("Нажмите [2] для просмотра актуального списка пользователей: ");
            System.out.println("Нажмите [0] для выхода из программы: ");
            String ch = in.nextLine();
            if (ch.equals("1")) {
                System.out.println("Нажмите [1] для ввода данных нового студента: ");
                System.out.println("Нажмите [2] для ввода данных нового сотрудника: ");
                String addch = in.nextLine();
                if (addch.equals("1")) {
                    System.out.println("Введите имя: ");
                    String name = in.nextLine();
                    System.out.println("Введите фамилию: ");
                    String surname = in.nextLine();
                    System.out.println("Введите GPA: ");
                    double gpa = in.nextDouble();
                    in.nextLine();
                    Student stud = new Student(10, "", "", name, surname, gpa);
                    while (true) {
                        System.out.println("Нажмите [1] для ввода нового курса: ");
                        System.out.println("Нажмите [0] для возврата в предыдущее меню: ");
                        String coursech = in.nextLine();
                        if (coursech.equals("1")) {
                            System.out.println("Введите название нового курса: ");
                            String course = in.nextLine();
                            stud.addCourse(course);
                        }
                        if (coursech.equals("0")) {
                            break;
                        }
                        users[indexOfUsers] = stud;
                        indexOfUsers++;
                    }
                }
                if (addch.equals("2")) {
                    System.out.println("Введите имя: ");
                    String name = in.nextLine();
                    System.out.println("Введите фамилию: ");
                    String surname = in.nextLine();
                    System.out.println("Введите размер зарплаты: ");
                    double salary = in.nextDouble();
                    in.nextLine();
                    Staff staff = new Staff(21, "", "", name, surname, salary);
                    while (true) {
                        System.out.println("Нажмите [1] для ввода нового предмета: ");
                        System.out.println("Нажмите [0] для возврата в предыдущее меню: ");
                        String subjectch = in.nextLine();
                        if (subjectch.equals("1")) {
                            System.out.println("Введите название нового предмета: ");
                            String subject = in.nextLine();
                            staff.addSubject(subject);
                        }
                        if (subjectch.equals("0")) {
                            break;
                        }
                        users[indexOfUsers] = staff;
                        indexOfUsers++;
                    }
                }
            }
            if (ch.equals("2")) {
                System.out.println("Нажмите [1] для просмотра актуального списка студентов: ");
                System.out.println("Нажмите [2] для просмотра актуального списка сотрудников: ");
                String addch = in.nextLine();
                if (addch.equals("1")) {
                    for (int i = 0; i < indexOfUsers; i++) {
                        if(users[i] instanceof Student) {
                            System.out.println(users[i].getData());
                        }
                    }
                }
                if (addch.equals("2")) {
                    for (int i = 0; i < indexOfUsers; i++) {
                        if (users[i] instanceof Staff) {
                            System.out.println(users[i].getData());
                        }
                    }
                }
            }
            if (ch.equals("0")) {
                System.out.println("Выход из программы ... ");
                break;
            }
        }
    }
}