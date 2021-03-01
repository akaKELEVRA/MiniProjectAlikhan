public class Lection4prac5 {
    public static void main (String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int min = nums[0];
        int max = nums[0];
        int imin = 0;
        int imax = 0;
        for (int i=0; i< nums.length;i++) {
            if(min>nums[i]) {
                min = nums[i];
                imin = i;
            }
            if (max<nums[i]) {
                max = nums[i];
                imax = i;
            }
            int temp = nums[imin];
            nums[imin] = nums[imax];
            nums[imax] = temp;
        }
    }
}

// Задание 20 Лекция 4
