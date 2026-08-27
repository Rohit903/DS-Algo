class Solution {
    // step1: parse over the array and flip the sign for the element at index nums[i] - 1.
    // step2: if the element is already negative let it be negative do not update the sign
    // step3: do one more pass to find positive numbers then its index + 1 will be the number i.e missing in nums
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingIntegerInNums = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] = -1*nums[index];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                missingIntegerInNums.add(i + 1);
            }
        }
        return missingIntegerInNums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna