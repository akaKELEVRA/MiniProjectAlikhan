import java.util.Scanner;

public class Lection7DZ13 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = in.nextInt();
        int [] arr = new int[a];
        method(arr);
    }
    public static void method (int [] arr) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            System.out.print("Введите значение для индекса: ");
            arr[i] = in.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2 == 0) {
                sum +=arr[i];
                count++;
            }
        }
        System.out.println();
        System.out.println("Среднее арифметическое всех четных элементов массива = " + sum/count);
    }
}
