package OOP.Lection11;

public class Programmers implements Workers {
    int id;
    String nickName;
    int salary;
    int bonusSalary;
    double kpiValue;

    public Programmers () {}

    public Programmers(int id, String nickName, int salary, int bonusSalary, double kpiValue) {
        this.id = id;
        this.nickName = nickName;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.kpiValue = kpiValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKpiValue() {
        return kpiValue;
    }

    public void setKpiValue(double kpiValue) {
        this.kpiValue = kpiValue;
    }

    @Override
    public String getWorkerData() {
        return id + ". " + nickName + " " + ". Salary = ";
    }

    @Override
    public int getSalary() {
        return (int)(salary + kpiValue * bonusSalary);
    }

    @Override
    public String toString() {
        return "Programmers{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", salary=" + salary +
                ", bonusSalary=" + bonusSalary +
                ", kpiValue=" + kpiValue +
                '}';
    }
}
