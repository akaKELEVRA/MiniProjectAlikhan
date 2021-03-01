package HMLection13;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {
    public MainMenu (MainFrame2 parent) {
        setSize(500,500);
        setLayout(null);

        JButton addStudPageButton = new JButton("ADD STUDENT");
        addStudPageButton.setSize(300,40);
        addStudPageButton.setLocation(100,100);
        add(addStudPageButton);

//        addStudPageButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                setVisible(false);
//                parent.addStudentPage.setVisible(true);
//            }
//        });
//
//        JButton listUsersPageButton = new JButton("LIST STUDENTS");
//        listUsersPageButton.setSize(300,40);
//        listUsersPageButton.setLocation(100,150);
//        add(listUsersPageButton);
//        listUsersPageButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                parent.listStudentsPage.setVisible(true);
//                parent.listStudentsPage.fillTextArea();
//                setVisible(false);
//            }
//        });
//
//        JButton exitButton = new JButton("EXIT");
//        exitButton.setSize(300,40);
//        exitButton.setLocation(100,200);
//        add(exitButton);
//
//        exitButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(1);
//            }
//        });



    }
}
