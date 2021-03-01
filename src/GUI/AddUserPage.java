package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddUserPage extends JPanel {
    public AddUserPage(MainFrame parent){
        setSize(500,500);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setLocation(100,100);
        nameLabel.setSize(100,40);
        add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setLocation(200,100);
        nameTextField.setSize(200,40);
        add(nameTextField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setLocation(100,150);
        lastNameLabel.setSize(100,40);
        add(lastNameLabel);

        JTextField lastNameTextField = new JTextField();
        lastNameTextField.setLocation(200,150);
        lastNameTextField.setSize(200,40);
        add(lastNameTextField);

        JLabel CityLabel = new JLabel("City:");
        CityLabel.setLocation(100,200);
        CityLabel.setSize(100,40);
        add(CityLabel);

        String[] cities = {"","Almaty","Astana","Atyrau","Karaganda"};
        JComboBox citiesComboBox = new JComboBox(cities);
        citiesComboBox.setLocation(200,200);
        citiesComboBox.setSize(200,40);
        add(citiesComboBox);

        JButton button = new JButton("ADD USER");
        button.setLocation(100,250);
        button.setSize(300,40);
        add(button);

        JButton backButton = new JButton("BACK TO MENU");
        backButton.setLocation(100, 300);
        backButton.setSize(300,40);
        add(backButton);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                nameTextField.setText("");
                String lastName = lastNameTextField.getText();
                lastNameTextField.setText("");
                String city = (String)citiesComboBox.getSelectedItem();
                citiesComboBox.setSelectedIndex(0);
                User user = new User(name,lastName,city);
                parent.users[parent.index] = user;
                parent.index++;
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                parent.menuPage.setVisible(true);
            }
        });
    }
}
