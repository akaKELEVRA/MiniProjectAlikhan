package Lection20.Lessonprac;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class ClientHandler implements Runnable{
    ObjectInputStream inputStream;
    ObjectOutputStream outputStream;
    // В каждый объект (клиент-серверное подключение) отправляется данные о подключении с клиентом
    public ClientHandler (Socket socket) throws IOException {
        // создается канал принятия данных с подключения
        inputStream = new ObjectInputStream(socket.getInputStream());
        // создается канал отправки данных по подключению
        outputStream = new ObjectOutputStream(socket.getOutputStream());
        // создается и запускается поток и этот объект подключается к нему
        new Thread(this).start();

    }

    @Override
    public void run() {
            try {
                while (true) {
                    String message = (String) inputStream.readObject();
                    if (message.contains("hello")) {
                        outputStream.writeObject("Hello from server!");
                    }
                    else outputStream.writeObject("I don't understand!");

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {

            }
    }
}
