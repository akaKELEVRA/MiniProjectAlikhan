package Lection19;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1",2000);
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        String name = in.nextLine();
        while (true) {
            System.out.println("PRESS [1] TO SEND MESSAGE");
            System.out.println("PRESS [2] TO EXIT");
            String choice = in.nextLine();
            if (choice.equals("1")) {
                System.out.println("Insert message text:");
                String messageText = in.nextLine();
                MessageData messageData = new MessageData(name, messageText);
                outputStream.writeObject(messageData);
            }
            if (choice.equals("2")) {
                break;
            }
        }
    }
}
