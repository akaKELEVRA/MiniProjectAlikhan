import java.util.Scanner;

public class Lection4DZ2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] nums = new int[n];
        String a = "Введите значение для индекса: ";
        for (int i = 0; i<n; i++) {
            System.out.print(a);
            nums[i] = in.nextInt();
        }
        for (int i=0; i<n; i++) {
            System.out.println(i + " - " + nums[i]);
        }
    }
}
