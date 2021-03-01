package Lection19;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
    public static void main (String[] args) throws IOException , ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(2000);
        System.out.println("WAITING FOR CLIENT");
        Socket socket = serverSocket.accept();
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        System.out.println("CLIENT CONNECTED");
        MessageData messageData;
        while (socket.isBound()) {
            messageData = (MessageData) inputStream.readObject();
            System.out.println(messageData);
        }

    }
}
