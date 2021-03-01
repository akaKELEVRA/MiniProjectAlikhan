public class Lection5prac4 {
    public static void main(String[] args) {
        int [] nums = {5,6,7,2,8,0,7,8,9,10};
        int count = 0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i]%2 == 0) count++;
        }
        int [] evennums = new int [count];
        int index = 0;
        for (int i=0; i<nums.length;i++) {
            if (nums[i]%2 ==0) {
                evennums[index] = nums[i];
                index++;
            }
        }
        for (int i=0; i<evennums.length; i++) {
            System.out.print(evennums[i]+" ");
        }
    }
}
