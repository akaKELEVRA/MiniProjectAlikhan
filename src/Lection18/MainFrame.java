package Lection18;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame () {
        setSize(1500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("BITLAB Application");

        JLabel aim = new JLabel("enemy");
        aim.setLocation(1420,190);
        aim.setSize(60,60);
        add(aim);




        JButton fire = new JButton("FIRE");
        fire.setBounds(600, 360,300,40);
        add(fire);

        fire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel bullet = new JLabel("fireball");
                bullet.setSize(40,40);
                add(bullet);
                MainThread thread = new MainThread(bullet);
                thread.start();
            }
        });
    }
}
