import java.util.Scanner;

public class Lection5prac2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = {6,4,2,8,5,10,7,8};
        int max = nums[0];
        int min = nums[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i]>max) {
                max = nums[i];
                maxIndex = i;
            }
            if (nums[i]<min) {
                min = nums[i];
                minIndex = i;
            }
        }
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[minIndex];
        nums[minIndex] = temp;
        System.out.println("Индекс минимума: " + minIndex + " " +  "Значение минимума: " + min);
        System.out.println("Индекс максимума: " + maxIndex + " " + "Значение максимума: " + max);

    }

}
