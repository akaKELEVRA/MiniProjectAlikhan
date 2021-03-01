import java.util.Scanner;
public class Lection3DZ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert text:");
        String s = in.next();
        System.out.println("Insert n");
        int n = in.nextInt();
        int a = 1;
        while (a<=n) {
            System.out.println(s);
            a++;
        }
    }
}
