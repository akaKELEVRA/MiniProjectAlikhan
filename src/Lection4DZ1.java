import java.util.Scanner;

public class Lection4DZ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] number = new int [n];
        String a = "Введите значение для индекса: ";
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            number[i] = in.nextInt();
        }
        for (int i=0; i<n; i++){
            System.out.println(number[i]);
        }
    }
}
