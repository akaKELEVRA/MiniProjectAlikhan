import java.util.Scanner;

public class Lection4DZ14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        double sum = 0;
        double count = 0;
        double aver = 0;
        String a = "Введите значение для индекса: ";
        String c = "Элементы массива, которые > среднего арифметического: ";
        for (int i=0; i<n; i++) {
            System.out.print(a);
            arr[i] = in.nextInt();
            sum = sum + arr[i];
            count++;
        }
        for (int i=0; i<n; i++) {
            aver = sum/count;
            if (arr[i]>aver) {
                System.out.println(c+arr[i]);
            }
        }
    }
}
