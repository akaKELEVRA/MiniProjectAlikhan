import java.util.Scanner;

public class Lection7prac4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        method(nums);
    }
    public static void method(int[][] numbers) {
        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers[i].length; j++) {
                if (i==j) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}
