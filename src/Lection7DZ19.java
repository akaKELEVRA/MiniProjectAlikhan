import java.util.Scanner;

public class Lection7DZ19 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = in.nextInt();
        int [] arr = new int[a];
        method(arr);
    }
    public static void method (int [] arr) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            System.out.print("Введите значение для индекса: ");
            arr[i] = in.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%5 != 0) {
                sum += arr[i];
            }
        }
        System.out.println("сумма элементов массива не учитывая элементы которые делятся на 5 без остатка = " + sum);
    }
}
