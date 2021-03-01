import java.util.Scanner;

public class Lection4prac3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = {1, 312, 1, 123, 123, 1, 123, 132, 8, 354, 29, 456, 76754, 23424, 868};
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 != 0) System.out.println(i);


//        for (int i = numbers.length; i < numbers.length;i--) {
//            System.out.println(numbers[i]+ " ");
//        }


//        for (int i = numbers.length - 1; i >=0; i--) {
//            System.out.println(numbers[i] + " ");
//        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[numbers.length - 1 - i] + " ");
        }
    }
}