import java.util.Scanner;

public class Lection4DZ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        String a = "Введите значение для индекса: ";
        int n = in.nextInt();
        int [] matr = new int [n];
        for (int i=0; i<n; i++) {
            System.out.print(a);
            matr[i] = in.nextInt();
        }
        for (int i=0; i<matr.length; i++) {
            System.out.println(matr[matr.length - 1 - i] + " ");
        }

    }
}
