package Lesson23;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.SQLException;

public class ClientHandler implements Runnable{
    Socket socket;
    ObjectInputStream inputStream;
    ObjectOutputStream outputStream;
    ServerClass server;
    public ClientHandler(ServerClass server, Socket socket) throws IOException {
        this.socket = socket;
        this.server = server;
        inputStream = new ObjectInputStream(socket.getInputStream());
        outputStream = new ObjectOutputStream(socket.getOutputStream());
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(true){
            try {
                PackageData pd = (PackageData) inputStream.readObject();
                if (pd.operationType.equals("add")){
                    server.addStudent(pd.getStudent());
                }
                else if(pd.operationType.equals("list")){
                    outputStream.writeObject(server.listStudents());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
