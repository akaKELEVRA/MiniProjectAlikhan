package MiniProject1;

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
        while (true) {
            Socket socket = server.accept();
            new ClientHandler(this,socket);
            System.out.println("Connected");
        }
    }

    public void addStudent (Students student) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students(id,name,surname,age) VALUES(null,?,?,?)");
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getSurname());
        preparedStatement.setInt(3, student.getAge());
        preparedStatement.executeUpdate();
    }

    public ArrayList<Students> listStudents () throws SQLException {
        ArrayList<Students> students = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM students");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            int age = resultSet.getInt("age");
            students.add(new Students(id, name, surname, age));
        }
        return students;
    }
}
