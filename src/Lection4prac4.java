import java.util.Scanner;

public class Lection4prac4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее значение = " + (double) sum / n);
    }
}