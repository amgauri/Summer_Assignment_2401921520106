package WEEK1.Day3;

public class MoveZeros {
    
    public static int[] moveZeroes(int[] nums) {
         int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }

        for (int j = k; j < nums.length; j++) {
            nums[j] = 0;
        }
        return nums;
    }
public static void main(String[] args){
    int[] nums={1,0,4,0,8};
    int[] ans= moveZeroes(nums);
    System.out.println("the final array=");
    for(int i=0;i<nums.length;i++){
    System.out.println(ans[i]);
    }
}
}