class Solution {
    public int findDuplicate(int[] nums) {
        int duplicateNum = 0;
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            //checking if already present/duplicated, if already present then it will be negative else positive
            if(nums[index] > 0){
                nums[index] = -1*nums[index];
            }else{
                duplicateNum = Math.abs(nums[i]);
                break;
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        return duplicateNum;
    }
}

/**
1,3,4,2,2
0,1,2,3,4

i=0
nums[0](1) > 0 true
-1,3,4,2,2

i=1
nums[2](4) > 0 true
-1,3,-4,2,2

i=2
nums[3](2) > 0 true
-1,3,-4,-2,2

i=3
nums[1](3) > 0 true
-1,-3,-4,-2,2

i=4
nums[1](-3) > 0 false
duplicateNum = 2
break


unmutate the array
1,3,4,2,2

duplicate: 2

 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna