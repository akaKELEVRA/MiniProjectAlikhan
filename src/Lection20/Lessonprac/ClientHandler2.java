package Lection20.Lessonprac;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler2 {
    ObjectInputStream inputStream;
    ObjectOutputStream outputStream;
    static int clients = 0;

    public ClientHandler2 (Server server, Socket socket) throws IOException {
        Scanner in = new Scanner(System.in);
        inputStream = new ObjectInputStream(socket.getInputStream());
        outputStream = new ObjectOutputStream(socket.getOutputStream());
        clients++;

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String name = (String) inputStream.readObject();
                    while (true) {
                        String message = (String) inputStream.readObject();
                        System.out.println(message);
                        server.sendMessageToAllClients(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


    public void sendMessage(String message) throws IOException {
        outputStream.writeObject(message);
        System.out.println("Message send");

    }
}
