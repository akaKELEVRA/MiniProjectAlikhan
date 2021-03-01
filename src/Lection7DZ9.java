import java.util.Scanner;

public class Lection7DZ9 {
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = in.nextInt();
        int [] arr = new int [a];
        System.out.println("Количество элементов не равных 0: " + notequals(arr));
    }
    public static int notequals(int [] arr) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            System.out.print("Введите значение для индекса: ");
            arr[i] = in.nextInt();
            if(arr[i]>0) {
                count++;
            }
        }
        return count;
    }
}
