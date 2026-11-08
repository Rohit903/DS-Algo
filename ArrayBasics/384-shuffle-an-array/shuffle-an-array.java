class Solution {
    int[] nums;
    int [] originalNums;
    public Solution(int[] nums) {
        this.nums = nums;
        this.originalNums = nums.clone();        
    }
    
    public int[] reset() {
        return this.originalNums;  
    }
    /*
    Generate a random number and permutate it that many items the original array
    **/
    public int[] shuffle() {
        Random rand = new Random();
        int index1 = rand.nextInt(this.nums.length);
        int index2 =  rand.nextInt(this.nums.length);
        int temp = this.nums[index1];
        this.nums[index1] = this.nums[index2];
        this.nums[index2] = temp;
        return this.nums;
    }
    
    // public int[] generatePermutation(){

    // }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna