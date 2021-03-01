import java.util.Scanner;
public class Lection2DZ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n число: ");
        int n = in.nextInt();
        if (n >= 10 && n <= 20) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
