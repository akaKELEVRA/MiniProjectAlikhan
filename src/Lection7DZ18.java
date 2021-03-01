import java.util.Scanner;

public class Lection7DZ18 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = in.nextInt();
        int [] arr = new int[a];
        method(arr);
    }
    public static void method (int [] arr) {
        Scanner in = new Scanner(System.in);
        for (int i=0; i<arr.length; i++) {
            System.out.print("Введите значение для индекса: ");
            arr[i] = in.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < 50 && arr[i]%5 == 0) {
                System.out.println(arr[i]);
            }
            System.out.println();
        }
    }
}
