import java.util.Scanner;

public class Lectioon4prac2 {
    public static void main(String [] args) {
        int [] numbers  = {1,2,3,4,5,12,123,32,325,574,7865,757,67868};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
        for (int i = 0; i < numbers.length;i++) {
            if (numbers[i]%2 == 0){
                System.out.println(numbers[i]);
            }

        }

    }
}
