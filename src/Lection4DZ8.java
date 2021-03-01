import java.util.Scanner;

public class Lection4DZ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        int maxn = 0;
        int minn = n; // не совсем корректно так писать, но другого способа я пока не придумал.
        String a = "Введите значение для индекса: ";
        String maxns = "Максимальный элемент: ";
        String minns = "Минимальный элемент: ";
        for (int i=0; i<arr.length; i++) {
            System.out.print(a);
            arr[i] = in.nextInt();
            if (maxn <= arr[i]) {
                maxn = arr[i];
            }
            if(arr[i]<minn) {
                minn = arr[i];
            }
        }

//        for (int i=0; i<n; i++) {
//            if (maxn <= arr[i]) {
//                maxn = arr[i];
//            }
//            if(arr[i]<minn) {
//                minn = arr[i];
//            }
//        }

        System.out.println(maxns+maxn);
        System.out.println(minns+minn);
    }
}
