import java.util.Scanner;

public class Lection4DZ16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int maxn = arr[0];
        int minn = arr[0];
        int maxn1 = 0;
        int minn1 = 0;
        String a = "Введите значение для индекса: ";
        for (int i=0; i<n; i++) {
            System.out.print(a);
            arr[i] = in.nextInt();
            if (maxn <= arr[i]) {
                maxn = arr[i];
            }
            if(arr[i]<minn) {
                minn = arr[i];
            }
        }
    }
}
