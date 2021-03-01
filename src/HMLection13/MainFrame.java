package HMLection13;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    Integer [] ages = new Integer [100];
    public MainFrame () {
        setSize(500,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setLayout(null);

        for (Integer i=0; i<100; i++) {
            ages[i] = i;
        }

        JLabel namelbl = new JLabel("Name:");
        namelbl.setLocation(100,150);
        namelbl.setSize(100, 40);
        add(namelbl);

        JTextField nameTxtFld = new JTextField();
        nameTxtFld.setLocation(200, 150);
        nameTxtFld.setSize(200, 40);
        add(nameTxtFld);

        JLabel phonelbl = new JLabel("Phone:");
        phonelbl.setLocation(100, 190);
        phonelbl.setSize(100,40);
        add(phonelbl);

        JTextField phoneTxtFld = new JTextField();
        phoneTxtFld.setLocation(200, 190);
        phoneTxtFld.setSize(200, 40);
        add(phoneTxtFld);

        JLabel agelbl = new JLabel("Age: ");
        agelbl.setLocation(100, 230);
        agelbl.setSize(100,40);
        add(agelbl);

        JComboBox ageCmbBox = new JComboBox(ages);
        ageCmbBox.setLocation(200, 230);
        ageCmbBox.setSize(200, 40);
        add(ageCmbBox);

        JTextArea txtArea = new JTextArea();
        txtArea.setLocation(100, 360);
        txtArea.setSize(300, 200);
        add(txtArea);

        JButton addbtn = new JButton("ADD CONTACT");
        addbtn.setLocation(100, 310);
        addbtn.setSize(300, 40);
        addbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTxtFld.getText();
                nameTxtFld.setText("");
                String phone = phoneTxtFld.getText();
                phoneTxtFld.setText("");
                Integer age = (Integer) ageCmbBox.getSelectedItem();
                ageCmbBox.setSelectedIndex(0);
                txtArea.append(name + " - " + phone + " - " + age + " years" + "\n");
            }
        });
        add(addbtn);
    }

}
