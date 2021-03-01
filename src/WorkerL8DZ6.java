public class WorkerL8DZ6 {
    int id;
    String name;
    String surname;
    String department;
    int salary;

    public WorkerL8DZ6 (){}

    public WorkerL8DZ6 (int id, String name, String surname, String department, int salary) {
        this.id = id;
        this.name = "Mr." + name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + surname + " " + department + " " + salary + " KZT";

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
