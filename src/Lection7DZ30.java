import java.util.Scanner;

public class Lection7DZ30 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = in.nextInt();
        int [] arr = new int[a];
        method(arr);
    }
    public static void method (int [] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение для m: ");
        int m = in.nextInt();
        for (int i=0; i<arr.length; i++) {
            System.out.print("Введите значение для индекса: ");
            arr[i] = in.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == i && arr[i]%m !=0) {
                System.out.print("Число в массиве, значение которого совпадает с его индексом и не делится на число m: " + arr[i]);
            }
        }
    }
}
