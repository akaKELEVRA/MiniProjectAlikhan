package OOP.Lection9;

public class Sport extends Citizen {
    String sporttype;

    public Sport(String id, String name, String surname, int age, String sporttype) {
        super(id, name, surname, age);
        this.sporttype = sporttype;
    }


}
