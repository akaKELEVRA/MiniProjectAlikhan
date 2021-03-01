package Lesson23;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;

public class ServerClass {
    Connection connection;
    public ServerClass() throws IOException, ClassNotFoundException, SQLException {
        ServerSocket server = new ServerSocket(2050);
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/group0801?useUnicode=true&serverTimezone=UTC","root", ""
        );
        while(true){
            Socket socket = server.accept();
            new ClientHandler(this, socket);
            System.out.println("Client connected");
        }

    }
    public void addStudent(Students student) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO students(id,name,surname,age) VALUES(null,?,?,?)");
        ps.setString(1, student.getName());
        ps.setString(2, student.getSurname());
        ps.setInt(3,student.getAge());
        ps.executeUpdate();
        System.out.println(student.getName()+" added");
    }
    public ArrayList<Students> listStudents() throws SQLException {
        ArrayList<Students> students = new ArrayList<>();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM students");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Long id = rs.getLong("id");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            int age = rs.getInt("age");
            students.add(new Students(id,name,surname,age));
        }
        return students;
    }
}
