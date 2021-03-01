package OOP.Lection9;

public class Staff extends User {
    private double salary;
    private String subjects [] = new String[100];
    private int indexOfSubject = 0;

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }


    public void addSubject (String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    public String showSubjects () {
        String s = "";
        for (int i=0; i<indexOfSubject; i++) {
            s = s + "\n\t" + subjects[i];
        }
        return s;
    }

    @Override
    public String getData() {
        return super.getData() + ". Salary = " + salary + showSubjects();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
