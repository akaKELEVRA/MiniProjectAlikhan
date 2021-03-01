package Lection19;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        ServerSocket server = new ServerSocket(2000);
        System.out.println("WAITING FOR CLIENT");
        Socket socket = server.accept();
        System.out.println("CLIENT CONNECTED");
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        String name = (String) inputStream.readObject();
        System.out.println(name + "Connected");
        String message = "";
        while (socket.isBound()) {
            message = (String) inputStream.readObject();
            System.out.println(name + ": " + message);
            if (message.contains("hello"))outputStream.writeObject("Hi");
            else if (message.contains("how")) outputStream.writeObject("Good");
            else outputStream.writeObject("I don't understaand!");
        }
    }
}
