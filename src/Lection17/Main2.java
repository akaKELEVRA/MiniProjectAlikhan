package Lection17;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> students = getStudents();

        while (true) {
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENTS");
            System.out.println("PRESS [0] TO EXIT");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.println("INSERT NAME:");
                String name = in.next();
                System.out.println("INSERT SURNAME:");
                String surname = in.next();
                Student stud = new Student(name, surname);
                while (true) {
                    System.out.println("PRESS [1] TO ADD SUBJECT");
                    System.out.println("PRESS [0] TO GO TO MAIN MENU");
                    int choicesubj = in.nextInt();
                    if (choicesubj == 1) {
                        System.out.println("INSERT NAME OF SUBJECT:");
                        String subjname = in.next();
                        System.out.println("INSERT CREDITS OF SUBJECT:");
                        int subjcred = in.nextInt();
                        Subject subject = new Subject(subjname, subjcred);
                        stud.subjects.add(subject);
                    }
                    if (choicesubj == 0) {
                        break;
                    }
                }
                students.add(stud);
                saveStudents(students);
            }
            if (choice == 2) {
                for (Student s : students) {
                    System.out.println(s);
                }
            }
            if (choice == 0) {
                break;
            }        }

    }

    public static void saveStudents (ArrayList<Student> students) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("memory.dat"));
        outputStream.writeObject(students);
    }

    public static ArrayList<Student> getStudents() throws IOException, ClassNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File("memory.dat");
        if (file.exists()) {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("memory.dat"));
            ArrayList<Student> reStudents = (ArrayList<Student>)  inputStream.readObject();
        }
        return students;
    }
}
