package Lection21;

import java.sql.*;
import java.util.Scanner;

public class DBManager {
    public static void main (String[] args) throws ClassNotFoundException, SQLException {
        Scanner in = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/group0801?useUnicode=true&serverTimezone=UTC","root", ""
        );
        System.out.println("CONNECTED");


//        String s = "INSERT INTO users(id,name,surname,age) VALUES(NULL, ?, ?,?)";
//        PreparedStatement ps = connection.prepareStatement(s);
//        System.out.println("ENTER NAME:");
//        ps.setString(1, in.next());
//        System.out.println("ENTER SURNAME:");
//        ps.setString(2,in.next());
//        System.out.println("ENTER AGE:");
//        ps.setInt(3,in.nextInt());
//        ps.executeUpdate();


        String s = "SELECT * FROM users";
        PreparedStatement ps = connection.prepareStatement(s);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            int age = rs.getInt("age");
            System.out.println(id + ". " +  name + " " + surname + ". Age: " + age);
        }
    }
}
