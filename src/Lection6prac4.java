import java.util.Scanner;

public class Lection6prac4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] nums = new int[n][m];
        int count = 0;
        for(int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                nums[i][j] = in.nextInt();
                if (nums[i][j]<0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (nums[i][j]>=0) {
                    System.out.print(nums[i][j] + " ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
