import java.util.Scanner;

public class Lection7DZ12 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = in.nextInt();
        int [] arr = new int[a];
        method(arr);
    }
    public static void method (int [] arr) {
        Scanner in = new Scanner(System.in);
        int max = arr[0];
        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            System.out.print("Введите значение для индекса: ");
            arr[i] = in.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
