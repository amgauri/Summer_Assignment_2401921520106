import java.util.HashMap;

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int b = target - nums[i];

            if (map.containsKey(b)) {
                return new int[]{map.get(b), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(nums, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}

class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {

                nums[i + 1] = nums[j];
                i++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4};

        int k = removeDuplicates(nums);

        System.out.println("Unique elements count: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}