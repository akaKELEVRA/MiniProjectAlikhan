import java.util.Scanner;

public class Lection4DZ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] arr = new int [n];
        String a = "Введите значение для индекса: ";
        String maxis = "Максимальный элемент: ";
        String b = "Индекс с максимальным элементом: ";
        int maxi = 0;
        int maxn = 0;
        for (int i=0; i<n; i++) {
            System.out.print(a);
            arr[i] = in.nextInt();
            if (maxn <= arr[i]) {
                maxn = arr[i];
                maxi = i;
            }
        }
        System.out.println(b+maxi);
        System.out.println(maxis+maxn);
    }
}
