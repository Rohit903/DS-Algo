class Solution {
    /**
    1.This is a move zero specialization where we need to move the val matching element in the arr to the end. 
    2. While moving to end capture the number val matches and count them.
    3. Return nums.length - count of val in arr
     */

    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public int moveVal(int[] nums, int val){
        int slow=0;
        int fast=1;
        int count=0;
        
        //array with 1 element scenario 
        //that element can be equal val then return k = 0 else k = 1
        if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            }
            return 1;
        }

        while(slow < nums.length - 1 && fast < nums.length){
            //case 1: slow == val and fast != val then swap and increment fast and slow
            if(nums[slow] == val && nums[fast] != val ){
                swap(nums,slow,fast);
                slow++;
                fast++;
                continue;
            }
            //case 2: slow != val and fast == val then slow increment and fast increment
            if(nums[slow] != val && nums[fast] == val){
                slow++;
                fast++;
                continue;
            }
            //case 3: slow == val and fast == val then increment fast
            if(nums[slow] == val && nums[fast] == val){
                fast++;
                continue;
            }
            //case 4: both are not equal to zero
            if(nums[slow] != val && nums[fast] != val){
                fast++;
                slow++;
                continue;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == val) {
                count++;
            }
        }
        return nums.length - count;
    }
    public int removeElement(int[] nums, int val) {
       return moveVal(nums,val); 
    }
}