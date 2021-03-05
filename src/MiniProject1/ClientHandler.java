package MiniProject1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.SQLException;

public class ClientHandler implements Runnable {
    Socket socket;
    ObjectInputStream inputStream;
    ObjectOutputStream outputStream;
    ServerClass server;

    public ClientHandler(ServerClass server, Socket socket) throws  IOException {
        this.server = server;
        this.socket = socket;
        inputStream = new ObjectInputStream(socket.getInputStream());
        outputStream = new ObjectOutputStream(socket.getOutputStream());
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                PackageData packageData = (PackageData) inputStream.readObject();
                if (packageData.operationType.equals("ADD_STUDENT")) {
                    server.addStudent(packageData.getStudent());
                }
                else if (packageData.operationType.equals("LIST_STUDENTS")) {
                    outputStream.writeObject(server.listStudents());
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
