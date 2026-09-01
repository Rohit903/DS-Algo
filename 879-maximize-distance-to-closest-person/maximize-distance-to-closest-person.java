class Solution {

    public int maxDistToClosest(int[] seats) {
        int start = 0;
        int max = 0;
        int i=1;
        for(;i<seats.length;i++){
            if(seats[i] == 1){
                //leading zero scenario
                if(seats[start] == 0){
                    max = Math.max(i - start, max);
                    start = i;
                }else{
                    //middle zero scenario [1,0,0,0,1]
                    max = Math.max((int)Math.floor(i - start)/2,max);
                    start = i;
                }
            }
        }
        //trailing zero scenario
        if(i == seats.length && seats[i -1] == 0){
            max = Math.max(max, i-start-1);
        } 
        return max;   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna