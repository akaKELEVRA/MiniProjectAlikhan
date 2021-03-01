public class Student {
    int id;
    String name;
    String surname;
    double gpa;
    public Student(){}
    public Student (int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = "Mrs." + name;
        this.surname = surname + "daughter";
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
