import java.util.Scanner;
public class Lection2Practise5 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String trlog = "user";
        String trpass = "password";
        System.out.println("Insert your login:");
        String log = in.next();
        System.out.println("Insert your password:");
        String pass = in.next();
        if (log.equals(trlog) && pass.equals(trpass)) System.out.println("Authentication completed");
        else System.out.println("Invalid login or password");
    }
}
