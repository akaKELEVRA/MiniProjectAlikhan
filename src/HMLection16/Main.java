package HMLection16;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<User> users = getUsersList();

        while (true) {
            System.out.println("[1] TO ADD USERS");
            System.out.println("[2] TO LIST USERS");
            System.out.println("[3] TO DELETE USERS");
            System.out.println("[4] TO EXIT");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.println("Insert id:");
                int id = in.nextInt();
                System.out.println("Insert login:");
                String login = in.next();
                System.out.println("Insert password:");
                String password = in.next();
                users.add(new User(id, login, password));
                addUser(users);
            }
            if (choice == 2) {
                for (User u : users) {
                    System.out.println(u);
                }
            }
            if (choice == 3) {
                for (int i = 0; i<users.size(); i++) {
                    System.out.println((i+1) + ") " + users.get(i));
                }
                System.out.println("Insert index of user to delete: ");
                int index = in.nextInt();
                users.remove(index-1);
                saveUsersList(users);
            }
            if (choice == 4) {
                break;
            }
        }

    }

    public static ArrayList<User> getUsersList () throws IOException {
        ArrayList<User> users = new ArrayList<>();
        File file = new File ("memory.txt");
        if (file.exists()) {
            BufferedReader bufrdr = new BufferedReader(new FileReader("memory.txt"));
            int id;
            while ((id = bufrdr.read()) != -1) {
                String login = bufrdr.readLine();
                String password = bufrdr.readLine();
                System.out.println(id + ". Login: " + login + " Password: " + password);
            }
        }
        return users;
    }

    public static void addUser (ArrayList<User> users) throws IOException {
        BufferedWriter bufwrt = new BufferedWriter(new FileWriter("memory.txt"));
        for (User u : users) {
            bufwrt.write(u.id + "\n");
            bufwrt.write(u.login + "\n");
            bufwrt.write(u.password + "\n");
        }
        bufwrt.close();
    }

    public static void saveUsersList (ArrayList<User> users) throws IOException {  // Что сюда писать то =)?
        BufferedWriter bufwrt = new BufferedWriter(new FileWriter("memory.txt"));

    }
}
