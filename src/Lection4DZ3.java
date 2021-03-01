import java.util.Scanner;

public class Lection4DZ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        String a = "Введите значение для индекса: ";
        String b = "Элемент с четным индексом: ";
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            nums[i] = in.nextInt();
        }
        for (int i=0; i<nums.length; i+=2) {
            System.out.println(b + nums[i]);
        }
    }
}
