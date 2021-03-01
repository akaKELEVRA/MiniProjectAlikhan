package HMLection13;



import javax.swing.*;

public class AddStudentPage extends JPanel {
    MainFrame2 parent;
    JButton addbtn;
    JButton backbtn;
    JLabel namelbl;
    JLabel surnamelbl;
    JLabel facultylbl;
    JLabel grouplbl;

    public AddStudentPage (MainFrame2 parent) {
        setSize(500, 500);
        setLayout(null);

        namelbl = new JLabel("NAME:");
        namelbl.setLocation(100, 100);
        namelbl.setSize(100, 40);
        add(namelbl);

        surnamelbl = new JLabel("SURNAME:");
        surnamelbl.setLocation(100, 140);
        surnamelbl.setSize(100,40);
        add(surnamelbl);

        facultylbl = new JLabel("FACULTY");

    }

}
