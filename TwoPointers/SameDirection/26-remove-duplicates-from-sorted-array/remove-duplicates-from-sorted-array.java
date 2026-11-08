class Solution {
    /**
    3 case needs to solved here given the array is sorted so the duplicates are present adjacent use the same pattern as move zeros

    1. slow and fast pointer point to same value element E.g 1,1 then move the fast pointer until slow and fast are not same
        then 
        Eg: 1,1,2 -> 1-slow,1-fast,2-> 1-slow,1,2-fast
    2. if the index difference between the slow and fast are more than 1 then swap slow + 1 with fast pointer.   
    3. So basically 
        3.1 if slow and fast are equal then fast++;
        3.2 if slow and fast are not equal and  fast - slow > 1 (alternate slow and slow - 1 if are equal swap slow with fast slow++ and fast++)then duplicate then swap slow + 1 with fast and then slow++ fast++ 
    */
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public int removeDuplicates(int[] nums) {
        //edge case
        if(nums.length == 1) return 1;
        int slow = 0;
        int fast = 1;
        while(slow < nums.length - 1 && fast < nums.length){
            //if slow and fast are equal then fast++
            if(nums[slow] == nums[fast]) {
                fast++;
            } else if(nums[slow] != nums[fast]){
                if(fast - slow > 1){
                    //there are duplicates between slow and fast so slow + 1 and fast should be swapped. Eg: 0->slow,0,0,1->fast,1
                    swap(nums,slow + 1,fast);
                    slow++;
                    fast++;
                }else{
                    //adjacent unique element should move forward
                    slow++;
                    fast++;
                }
            }
        }
        //sinc slow points to the last unique element index so + 1 added to make it length
        return slow + 1;
    }
}