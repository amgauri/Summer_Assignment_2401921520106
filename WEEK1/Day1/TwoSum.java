import java.util.HashMap;

class TwoSum {                       //TwoSum function

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>(); //creating HashMap

        for (int i = 0; i < nums.length; i++) {           

            int complement = target - nums[i];

            if (map.containsKey(complement)) {              //if its already mapped in hashmap?
                return new int[]{map.get(complement), i};         //if already there then return its index along with the current index.
            }

            map.put(nums[i], i);                        //if not then put it in hashmap
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {             //main function

        int[] nums = {3, 6, 12, 25};
        int target = 9;

        int[] ans = twoSum(nums, target);              //function calling

        System.out.println(ans[0] + " " + ans[1]);        
    }
}
