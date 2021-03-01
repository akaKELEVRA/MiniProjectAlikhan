package Lesson23;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        Socket socket = new Socket("192.168.1.127",2050);
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        while(true){
            System.out.println("[1] TO ADD STUDENT");
            System.out.println("[2] TO LIST STUDENTS");
            System.out.println("[0] TO EXIT");
            String choice = in.next();
            if (choice.equals("1")){
                System.out.println("ENTER NAME: ");
                String name = in.next();
                System.out.println("ENTER SURNAME: ");
                String surname = in.next();
                System.out.println("ENTER AGE:");
                int age = in.nextInt();
                Students student = new Students(null,name,surname,age);
                outputStream.writeObject(new PackageData("add",student,null));
            }
            if (choice.equals("2")){
                outputStream.writeObject(new PackageData("list",null,null));
                ArrayList<Students> students = (ArrayList<Students>) inputStream.readObject();
                for (Students s: students){
                    System.out.println(s);
                }
            }
        }
    }
}
