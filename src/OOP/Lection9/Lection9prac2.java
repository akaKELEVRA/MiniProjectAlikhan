package OOP.Lection9;

import java.util.Scanner;

public class Lection9prac2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        User [] users = new User [100];
        int indexOfUsers = 0;
        Staff s1 = new Staff(1, "login", "password", "Askar", "Zhumagaliyev", 3000);
        while (true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            String choice = in.next();
            if (choice.equals("1")) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF");
                String addchoice = in.next();
                if (addchoice.equals("1")) {
                    System.out.println("ENTER NAME:");
                    String name = in.next();
                    System.out.println("ENTER SURNAME:");
                    String surname = in.next();
                    System.out.println("ENTER SALARY:");
                    double salary = in.nextDouble();
                    Staff staff = new Staff(1, "login", "password", name, surname, 2000);
                    while (true) {
                        System.out.println("[1] ADD TO SUBJECT");
                        System.out.println("[0] TO GO BACK");
                        String subjectChoice = in.next();
                        if (subjectChoice.equals("1")) {
                            System.out.println("ENTER SUBJECT NAME:");
                            String subject = in.next();
                            staff.addSubject(subject);
                        }
                        if (subjectChoice.equals("0")) {
                            break;
                        }
                        users[indexOfUsers] = staff;
                        indexOfUsers++;
                    }
                }
            }
            if (choice.equals("2")) {
                for (int i=0; i<indexOfUsers; i++) {
                    System.out.println(users[i].getData());
                }
            }
            if (choice.equals("0")) {
                break;
            }
        }

    }

}
