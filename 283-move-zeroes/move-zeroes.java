class Solution {
    /**
    1. use two pointer approach in same directin
    2. 3 cases to solve for
       1. slow and fast point to non zero number,then increment both slow and fast
       2. if slow or fast is 0 then swap fast with slow if fast is non zero else other wise
            slow = 0 fast non-zero since left side should have non zero swap towards left and increment fast and slow
            slow = 1 fast 0 move both fast and slow
       3. if both are pointing to 0 then only move the fast pointer until non zero and swap non zero fast pointer with slow and increment slow  
     */
    public void moveZeroes(int[] nums) {
        if(nums.length <= 1) return;

        int slow = 0;
        int fast = 1;
        while(slow < nums.length - 1 && fast < nums.length){
            //one of them is zero
            if(nums[slow] == 0 && nums[fast] != 0){
                swap(nums, slow,fast);
                slow++;
                fast++;
                continue;
            }
            if(nums[slow] != 0 && nums[fast] == 0){
                fast++;
                slow++;
                continue;
            }
            //both are non-zero
            if(nums[slow] != 0 && nums[fast] != 0){
                slow++;
                fast++;
                continue;
            }

            //both are zero
            if(nums[slow] == 0 && nums[fast] == 0){
                fast++;
            }
        }
    }

    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna