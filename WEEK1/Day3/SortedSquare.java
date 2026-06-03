package WEEK1.Day3;

public class SortedSquare {
    public static int[] sortedSquares(int[] nums) {

        int i=0;
        int j=nums.length-1;
        int idx=j;
        int[] k =new int[j+1];
       for(i=0;i<=j;){
        nums[i]=Math.abs(nums[i]);
        nums[j]=Math.abs(nums[j]);
        if(nums[i]>nums[j]){
            k[idx]=nums[i]*nums[i];
            i++;
            idx--;
        }
        else{
            k[idx]=nums[j]*nums[j];
            j--;
            idx--;
        }
       } 
        return k;
    }
    public static void main(String[] args){
    int[] nums={-4,-1,0,5,6,10};
    int[] ans= sortedSquares(nums);
    for(int num : ans){
    System.out.print(num + " ");
}
}
}
    
