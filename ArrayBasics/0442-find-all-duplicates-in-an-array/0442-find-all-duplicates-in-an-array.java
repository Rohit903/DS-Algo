class Solution {
    //step 1: loop over arr and map nums[i] - 1 index with flipping its sign
        //step 1.1: before flipping the sign check if it alreay negative if yes then nums[i] is duplicate add to output array.  
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output = new ArrayList<>();

        //loop over array
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0){
                //use nums[i] as the index and make nums[i] - 1 index element as negative only change the sign of the element
                nums[index] = -1*Math.abs(nums[index]);
            }else{
                output.add(Math.abs(nums[i]));
            }

        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna