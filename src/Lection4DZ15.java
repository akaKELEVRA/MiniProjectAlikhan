import java.util.Scanner;

public class Lection4DZ15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int x = in.nextInt();
        int[] arr = new int[x];
        int m = 0;
        String y = "Yes";
        String n = "No";
        String z = "Index: ";
        String a = "Введите значение для индекса: ";
        String b = "Введите значение для проверки соответствия: ";
        for (int i = 0; i < x; i++) {
            System.out.print(a);
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < x; i++) {
            System.out.print(b);
            m = in.nextInt();
            if (m == arr[i]) {
                System.out.println();
                System.out.println(y);
                System.out.println(z + i);
            } else {
                System.out.println();
                System.out.println(n);
            }
        }
    }
}
