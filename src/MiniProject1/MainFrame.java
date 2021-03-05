package MiniProject1;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    MainMenu mainMenu;
    FirstPage firstPage;
    SecondPage secondPage;

    ArrayList<Students> students;

    public MainFrame () throws IOException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Students Application");
        setSize(500,500);
        setLayout(null);

        mainMenu = new MainMenu(this);
        mainMenu.setVisible(true);
        add(mainMenu);

        firstPage = new FirstPage(this);
        firstPage.setVisible(false);
        add(firstPage);

        secondPage = new SecondPage(this);
        secondPage.setVisible(false);
        add(secondPage);
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public FirstPage getFirstPage() {
        return firstPage;
    }

    public SecondPage getSecondPage() {
        return secondPage;
    }

    public ArrayList<Students> getStudents () {return students;}

}
