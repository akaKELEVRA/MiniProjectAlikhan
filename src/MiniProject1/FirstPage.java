package MiniProject1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FirstPage extends JPanel {
    MainFrame parent;

    JLabel nameLabel;
    JLabel surnameLabel;
    JLabel ageLabel;
    JTextField nameField;
    JTextField surnameField;
    JTextField ageField;
    JButton addButton;
    JButton backButton;


    public FirstPage (MainFrame parent) throws IOException {
        this.parent = parent;

        Socket socket = new Socket("127.0.0.1", 2050);
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

        setSize(500,500);
        setLayout(null);

        nameLabel = new JLabel("NAME:");
        nameLabel.setBounds(100,100,80,30);
        add(nameLabel);

        surnameLabel = new JLabel("SURNAME:");
        surnameLabel.setBounds(100,150,80,30);
        add(surnameLabel);

        ageLabel = new JLabel("AGE:");
        ageLabel.setBounds(100, 200, 80,30);
        add(ageLabel);

        nameField = new JTextField();
        nameField.setBounds(160,100,200,30);
        add(nameField);
        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {}
        });

        surnameField = new JTextField();
        surnameField.setBounds(160,150,200,30);
        add(surnameField);
        surnameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {}
        });

        ageField = new JTextField();
        ageField.setBounds(160,200,200,30);
        add(ageField);
        ageField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {}
        });

        addButton = new JButton("ADD");
        addButton.setBounds(130,350,100,30);
        add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Students student = new Students(null, nameField.getText(), surnameField.getText(), Integer.parseInt(ageField.getText()));
                try {
                    outputStream.writeObject(new PackageData("ADD_STUDENT", null, student));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        backButton = new JButton("BACK");
        backButton.setBounds(280,350,100,30);
        add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getFirstPage().setVisible(false);
                parent.getMainMenu().setVisible(true);
            }
        });

    }

}
