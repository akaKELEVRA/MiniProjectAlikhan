public class Human {
    String name;
    String lastname;
    int age;
    public Human(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public void sayHello() {
        System.out.println(name + " " + lastname + " says Hello");
    }

}
