class Solution {
    public int maxDistToClosest(int[] seats) {
        /**
        Step 1: start with first index as starting point 
        Step 2: Find the window by considering 0th index as start and end index as floating window which stops at seat[i] = 1 i.e seat occupied.
        step 3: Once the window is identified then run below rules
            3.1 if the window start or end is not occupid then answer is right - left 
            3.2 if the window start and end both are occupied then distance is right - left/2.


         */
        //step 1 find the windows

        int max=0;
        int i = 0;
        int j = i + 1;
        for(;i<seats.length;i++){
            for(;j<seats.length;j++){
                if(seats[j] == 1){
                //calculate and set prevMax and max
                    //staring seat can be empty
                    if(seats[i] == 0){
                        max = Math.max(j - i,max);
                        i=j-1;
                        j = j + 1;
                        System.out.println("i:" + i + "and j:" + j);
                        break;
                    }else{
                    //set the new window index as last window ending included
                        int maxValue = (int)Math.floor((j - i)/2);
                        max = Math.max(maxValue,max);
                        i=j-1;
                        j= j+1;
                        break;
                    }
                   
                }
            }
            
        //ending seat can be empty
            if(j == seats.length && seats[j-1] == 0){
                System.out.println("i:" + i + "and j:" + j);

                max = Math.max(j - i - 1,max);
                break;
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna