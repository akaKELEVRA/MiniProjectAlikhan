import java.util.Scanner;
public class Lection3prac3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        while (n!=0) {
            n = in.nextInt();
            counter++;
        }
        System.out.println(counter);
    }

}
