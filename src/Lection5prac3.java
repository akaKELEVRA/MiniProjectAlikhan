public class Lection5prac3 {
    public static void main(String[] args) {
        int [] nums = {5,6,7,2,8,0,7};
        int n = 2;
        int index = -1;
        for (int i=0;i<nums.length; i++) {
            if(nums[i] == n) {
                index = i;
            }
        }
        if (index !=-1) {
            System.out.println("Yes");
            System.out.println("Index = " + index);

        }
        else System.out.println("No");
    }
}
