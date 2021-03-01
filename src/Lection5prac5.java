public class Lection5prac5 {
    public static void main(String[] args) {
        int [] nums = {5,-6,7,-2,8,-1,7,-8,9,-10};
        boolean b = true;
        for (int i=0; i<nums.length-1; i++) {
            if (!((nums[i]>=0 && nums[i+1]<0) || (nums[i]<0 && nums[i+1]>=0))) b=false;
        }
        System.out.println(b);
    }
}
// Лекция №4 задание 30