import java.util.HashSet;
class ContainsDuplicate {
    public static boolean contains_duplicate(int[] nums) {
        int i=0;
        HashSet<Integer> hashset= new HashSet<>();
        for(i=0;i<nums.length;i++){
            if(hashset.contains(nums[i])){
                return true;
            }
            hashset.add(nums[i]);
           }
        return false;   
    }
public static void main(String[] args){
    int[] nums={1,2,3,1};
    boolean ans= contains_duplicate(nums);
    System.out.println(ans);
}
}