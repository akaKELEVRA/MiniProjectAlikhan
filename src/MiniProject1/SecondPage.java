package MiniProject1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class SecondPage extends JPanel {
    MainFrame parent;

    JButton backButton;
    JButton listButton;
    String header [] = {"Name, Surname, Age"};
    JTable table;
    JScrollPane scrollPane;


    public SecondPage(MainFrame parent) throws IOException {
        this.parent = parent;

        Socket socket = new Socket("127.0.0.1", 2050);
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

        setSize(500,500);
        setLayout(null);

        listButton = new JButton("LIST");
        listButton.setBounds(125,400,100,30);
        add(listButton);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    outputStream.writeObject(new PackageData("LIST_STUDENTS", null, null));
                    ArrayList<Students> students = (ArrayList<Students>) inputStream.readObject();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }

            }
        });

        backButton = new JButton("BACK");
        backButton.setBounds(275,400,100,30);
        add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getSecondPage().setVisible(false);
                parent.getMainMenu().setVisible(true);
            }
        });

        table = new JTable();
        table.setFont(new Font("TimesNewRoman", Font.PLAIN, 12));
        table.setRowHeight(30);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(400,100,100,100);
        add(scrollPane);


    }

    public void generateTable(ArrayList<Students> students) {
        Object data [][] = new Object[students.size()][3];
        for (int i=0; i<students.size(); i++) {
            data[i][0] = students.get(i).getName();
            data[i][1] = students.get(i).getSurname();
            data[i][0] = students.get(i).getAge();
        }
        DefaultTableModel model = new DefaultTableModel(data, header);
        table.setModel(model);
    }
}
