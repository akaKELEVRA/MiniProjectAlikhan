import java.util.Scanner;

public class Lection4DZ7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] arr = new int [n];
        int sum = 0;
        String a = "Введите значение для индекса: ";
        String b = "Сумма всех элементов = ";
        for (int i=0; i<n; i++) {
            System.out.print(a);
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        System.out.print(b + sum);
    }
}
