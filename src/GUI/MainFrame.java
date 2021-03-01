package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    AddUserPage addUserPage;
    MenuPage menuPage;
    ListUsersPage listUsersPage;
    User[] users = new User[100];
    int index = 0;
    public MainFrame(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("BITLAB application");
        setLayout(null);

        menuPage = new MenuPage(this);
        add(menuPage);

        addUserPage = new AddUserPage(this);
        add(addUserPage);
        addUserPage.setVisible(false);

        listUsersPage = new ListUsersPage(this);
        add(listUsersPage);
        listUsersPage.setVisible(false);

    }
}
