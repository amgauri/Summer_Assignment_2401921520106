class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) { //function 

        int i = 0;

        for (int j = 1; j < nums.length; j++) {         //two pointers i and j used simultaneously

            if (nums[i] != nums[j]) {                        //check if two numbers at i and j index are not equal  

                nums[i + 1] = nums[j];                       //if not equal then the next index would have the unique number
                i++;                                         //update i 
            }
        }                                                //if equal j will be updated till the next unique is met

        return i + 1;                                       //total unique elements
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 5, 5, 4, 3};

        int k = removeDuplicates(nums);

        System.out.println("Unique elements count: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");          //the new array is printed
        }
    }
}