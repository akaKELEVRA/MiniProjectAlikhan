package OOP.Lection9;

public class Citizen {
    String id;
    String name;
    String surname;
    int age;

    public Citizen(String id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getCitizenInfo() {
        return id + ". " + name + " " + surname + ". Age = " + age;
    }
}
