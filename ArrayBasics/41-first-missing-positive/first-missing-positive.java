class Solution {
    //remove the elements that are more than >= N, duplicates and negative elements.                                     
    public int firstMissingPositive(int[] nums) {
        // update the negative number and nums[i] > N
        int N = nums.length;
        for(int i=0;i<N;i++){
            if(nums[i] <= 0 || nums[i] > N ){
                nums[i] = N + 1;
            }
        }
        // if the nums[i] > 0 and nums[i] < N + 1 then the element is present we need to mark the element at index nums[i] - 1 as present in the input array compared to the solution space 1...N by making it negative.
        for(int i=0;i<N;i++){
            // System.out.println("nums: " + nums[i] + " " + N);
            if(Math.abs(nums[i]) <= N ){
                int x = Math.abs(nums[i]); 
                // System.out.println(x + " " + N);
                nums[x - 1] = -1*Math.abs(nums[x - 1]);
            }
        }

        //parse the nums array and find first positive number nums[i] then i + 1 index is the missing number. Why i + 1 because 
        //the array is 0 indexed and we had marked nums[x] - 1 index as present to accommodate the 1 to N values on the output space.
        for(int i=0;i<N;i++){
                    // System.out.println("nums: " + nums[i] + " " + N);

            if(nums[i] > 0){
                return i + 1;
            }
        }

        //if all the elements are present then the answer is N + 1
        return N + 1;
    }
}
//3,4,-1,1 => 3,4,6,1
//3,4,-6,1=> 
//

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna