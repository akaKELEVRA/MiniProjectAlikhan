import java.util.Scanner;
public class Practise1 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String surname = scan.next();
        int age = scan.nextInt();
        String country = scan.next();
        System.out.println("Name " + name);
        System.out.println("Surname " + surname);
        System.out.println("Age " + age);
        System.out.println("Country " + country);
    }
}
