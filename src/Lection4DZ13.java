import java.util.Scanner;

public class Lection4DZ13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        double sum = 0;
        double countneg = 0;
        String a = "Введите значение для индекса: ";
        String c = "Среднее значение отрицательных элементов = ";
        for (int i=0; i<n; i++) {
            System.out.print(a);
            arr[i] = in.nextInt();
            if (arr[i] < 0) {
                sum = sum + arr[i];
                countneg++;
            }
        }
        System.out.println(c + (sum/countneg));
    }
}