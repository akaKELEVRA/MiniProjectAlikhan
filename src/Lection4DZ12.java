import java.util.Scanner;

public class Lection4DZ12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        int count = 0;
        int maxn = 0;
        int minn = n; // не совсем корректно так писать, но другого способа я пока не придумал.
        String a = "Введите значение для индекса: ";
        String b = "Сумма всех элементов, исключая МАКС и МИН = ";
        String c = "Среднее значение, исключая МАКС и МИН = ";
        for (int i = 0; i<n; i++) {
            System.out.print(a);
            arr[i] = in.nextInt();
            sum = arr[i] + sum;
            count++;
            if (maxn <= arr[i]) {
                maxn = arr[i];
            }
            if (minn > arr[i]) {
                minn = arr[i];
            }
        }
        double sumw = sum-(maxn+minn);
        double countw = n-2;
        System.out.println(b + sumw);
        System.out.println(c + sumw/countw);
    }
}