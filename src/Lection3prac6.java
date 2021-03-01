import java.util.Scanner;
public class Lection3prac6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = n;
        while (n!=0) {
            n = in.nextInt();
            if (n<min && n!=0) min = n;
        }
        System.out.println(min);
    }
}
