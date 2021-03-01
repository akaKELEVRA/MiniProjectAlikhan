package Lection21;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Connection connection;
    public static void main (String[] args) throws SQLException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<Items>();
        connectToJdbc();

        while (true) {
            System.out.println("PRESS [1] TO ADD ITEMS");
            System.out.println("PRESS [2] TO LIST ITEMS");
            System.out.println("PRESS [3] TO DELETE ITEMS");
            System.out.println("PRESS [0] TO EXIT");
            String choice = in.next();
            if(choice.equals("1")) {
                System.out.println("ENTER NAME:");
                String name = in.next();
                System.out.println("ENTER PRICE:");
                double price = in.nextDouble();
                Items it1 = new Items(null, name, price);
                addItem(it1);
            }
            else if (choice.equals("2")) {
                items = getAllItems();
                for (Items it : items) {
                    System.out.println(it);
                }
            }
            else if (choice.equals("3")) {
                System.out.println("Insert ID of item:");
                int id = in.nextInt();
                deleteItems(id);

            }
            else if (choice.equals("0")) {
                System.exit(0);
            }
        }
    }

    public static void connectToJdbc () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/group0801?useUnicode=true&serverTimezone=UTC","root", ""
        );
        System.out.println("CONNECTED");
    }

    public static void addItem (Items it) {
        try {
            PreparedStatement prst = connection.prepareStatement("INSERT INTO items(id, name, price) values(null,?,?)");
            prst.setString(1, it.getName());
            prst.setDouble(2, it.getPrice());
            prst.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Items> getAllItems () {
        ArrayList<Items> items = new ArrayList<>();
        try {
            String s = "SELECT * FROM items";
            PreparedStatement prst = connection.prepareStatement(s);
            ResultSet resultSet = prst.executeQuery();
            while(resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                items.add(new Items(id, name, price));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }

    public static void deleteItems (int id) {
        try {
            PreparedStatement prst = connection.prepareStatement("DELETE FROM items where id=?");
            prst.setInt(1, id);
            prst.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
