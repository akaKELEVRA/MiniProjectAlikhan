package Lection20;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        Socket socket = new Socket(2000);
//        ObjectOutputStream outputStream = new ObjectOutputStream(socket.get);

        while (true) {
            System.out.println("PRESS [1] TO LIST BOOKS");
            System.out.println("PRESS [2] TO ADD BOOKS");
            System.out.println("PRESS [0] TO DISCONNECT FROM SERVER");
        }

    }
}
