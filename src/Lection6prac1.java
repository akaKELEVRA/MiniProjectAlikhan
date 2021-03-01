import java.util.Scanner;

public class Lection6prac1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] nums = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
//        System.out.println(nums[1][3]);

//        for (int i=0; i<5; i++) {
//            System.out.println(nums[0][i]);
//        }
//        for (int i=0; i<5; i++) {
//            System.out.println(nums[1][i]);
//        }
//        for (int i=0; i<5; i++) {
//            System.out.println(nums[2][i]);
//        }
//        for (int i=0; i<5; i++) {
//            System.out.println(nums[3][i]);

        for (int i=0; i< nums.length; i++) {
            for (int j=0; j<nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
                }
            System.out.println();

        }
    }

}
