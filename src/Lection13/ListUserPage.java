package Lection13;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListUserPage extends JPanel {
    JTextArea textArea;
    MainFrame parent;
    public ListUserPage (MainFrame parent) {
        this.parent = parent;
        setSize(500, 500);
        setLayout(null);
        textArea = new JTextArea();
        textArea.setSize(300, 200);
        textArea.setLocation(100,100);
        add(textArea);

        JButton backButton = new JButton("BACK TO MENU");
        backButton.setSize(300,40);
        backButton.setLocation(100,350);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.menuPage.setVisible(true);
            }
        });
    }

    public void fillTextArea () {
        for (int i = 0; i < parent.index; i++) {
            textArea.append(parent.users[i].name + " " + parent.users[i].lastName + ". City: " + parent.users[i].city + "\n");
        }
    }
}
