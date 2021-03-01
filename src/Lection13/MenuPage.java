package Lection13;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPage extends JPanel {
    public MenuPage(MainFrame parent) {
        setSize(500,500);
        setLayout(null);

        JButton addUserPageButton = new JButton("ADD NEW USER: ");
        addUserPageButton.setSize(300,40);
        addUserPageButton.setLocation(100,100);
        add(addUserPageButton);

        addUserPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                parent.addUserPage.setVisible(true);

            }
        });

        JButton listUsersPageButton = new JButton("LIST USERS: ");
        listUsersPageButton.setSize(300,40);
        listUsersPageButton.setLocation(100,150);
        add(listUsersPageButton);

        listUsersPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.listUserPage.setVisible(true);
                parent.listUserPage.fillTextArea();
                setVisible(false);
            }
        });

        JButton exitButton = new JButton("EXIT");
        exitButton.setSize(300,40);
        exitButton.setLocation(100,200);
        add(exitButton);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }
}
