package Lection17;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        User user1 = new User ("Brad", "Pitt");
        User user2 = new User ("Jennifer", "Lopez");



        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("OOSFile.txt"));
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        outputStream.writeObject(users);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("OOSFile.txt"));
        ArrayList<User> reUsers = (ArrayList<User>)  inputStream.readObject();
        for (User u : reUsers) {
            System.out.println(u);
        }
    }
}
