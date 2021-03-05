package MiniProject1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class MainMenu extends JPanel {
    private MainFrame parent;
    private JButton addStudentButton;
    private JButton listStudentsButton;
    private JButton exitButton;

    public MainMenu (MainFrame parent) throws IOException {
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        addStudentButton = new JButton("ADD STUDENT");
        addStudentButton.setBounds(150,155,200,30);
        add(addStudentButton);
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getMainMenu().setVisible(false);
                parent.getFirstPage().setVisible(true);
            }
        });

        listStudentsButton = new JButton("LIST STUDENTS");
        listStudentsButton.setBounds(150,235,200,30);
        add(listStudentsButton);
        listStudentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getSecondPage().generateTable(parent.getStudents());
                parent.getMainMenu().setVisible(false);
                parent.getSecondPage().setVisible(true);
            }
        });

        exitButton = new JButton("EXIT");
        exitButton.setBounds(150,315,200,30);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
