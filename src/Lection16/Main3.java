package Lection16;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<User> users = listUsers();
        while (true) {
            System.out.println("[1] TO ADD USER");
            System.out.println("[2] TO LIST USERS");
            System.out.println("[0] TO EXIT");
            String choice = in.next();
            if (choice.equals("1")) {
                System.out.println("ENTER NAME:");
                String name = in.next();
                System.out.println("ENTER SURNAME: ");
                String surname = in.next();
                System.out.println("ENTER AGE: ");
                int age = in.nextInt();
                users.add(new User(name, surname, age));
                addUsers(users);
            }
            if (choice.equals("2")) {
                for(User u:users){
                    System.out.println(u);
                }
            }
            if (choice.equals("0")) break;
        }
    }

    public static void addUsers(ArrayList<User> users) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Database.txt"));
        for (User u : users) {
            bw.write(u.name + "\n");
            bw.write(u.surname + "\n");
            bw.write(u.age + "\n");
        }
        bw.close();
    }
    public static ArrayList<User> listUsers() throws IOException {
        ArrayList<User> users = new ArrayList<>();
        File file = new File("Database.txt");
        if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader("Database.txt"));
            String name;
            while ((name = br.readLine()) != null) {
                String surname = br.readLine();
                int age = Integer.parseInt(br.readLine());
                users.add(new User(name, surname, age));
            }
        }
        return users;
    }

}
