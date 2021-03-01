import java.util.Scanner;

public class Lection4DZ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        String a = "Введите значение для индекса: ";
        String b = "Количество положительных элементов: ";
        int count = 0;
        for (int i=0; i<n; i++) {
            System.out.print(a);
            arr[i] = in.nextInt();
            if (arr[i]>0) {
                count++;
            }
        }
        System.out.println(b+count);
    }

}
