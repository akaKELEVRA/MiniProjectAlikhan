public class BubbleSort {  // сортировка пузырьковым методом по возрастанию
    public static void main (String[] agrs) {
        int [] nums = {3, 56, 544, 7, 2, 98, 23, 6, 12, 42, 5, 8, 12};
        for (int i= nums.length-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i=0; i<nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
