import java.util.Scanner;

public class Lection4DZ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        int maxn = 0;
        int minn = n;
        String a = "Введите значение для индекса: ";
        String b = "Разница между МАКС и МИН элементами = ";
        for (int i=0; i<n; i++) {
            System.out.print(a);
            arr[i] = in.nextInt();
            if (maxn <= arr[i]) {
                maxn = arr[i];
            }
            if (minn > arr[i]) {
                minn = arr[i];
            }
        }
        System.out.println(b + (maxn-minn));
    }
}
