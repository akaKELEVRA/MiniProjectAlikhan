package OOP.Lection9;

public class Health extends Citizen {
    String bolezn;
    String doctor;

    public Health(String id, String name, String surname, int age, String bolezn, String doctor) {
        super(id, name, surname, age);
        this.bolezn = bolezn;
        this.doctor = doctor;
    }

    @Override
    public String getCitizenInfo() {
        return super.getCitizenInfo()+". Болезнь - " + bolezn + ". Доктор " + doctor;
    }
}
