package Lection20.Lessonprac;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    ArrayList<ClientHandler2> clients = new ArrayList<>();
    public Server() throws IOException {
        ServerSocket server = new ServerSocket(2000);
        while (true) {
            Socket socket = server.accept();
            clients.add(new ClientHandler2(this, socket));
        }
    }

    public void sendMessageToAllClients (String message) throws IOException{
        for (ClientHandler2 ch:clients) {
            ch.sendMessage(message);
        }

    }
}
