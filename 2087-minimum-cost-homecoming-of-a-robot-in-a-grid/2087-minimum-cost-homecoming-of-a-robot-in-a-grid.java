class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int ans = 0;

// starting location 
        int sr = startPos[0];
        int sc = startPos[1];

//home location 
        int hr = homePos[0];
        int hc = homePos[1];


        //move row 

        if(sr > hr) //if home if behind starting positon 
        {
            for(int i = sr-1; i>= hr; i --){
                ans += rowCosts[i];
            }
        }
        else{ // if home if forward starting positon 
         
         for(int i = sr+1; i <= hr; i ++){
                ans += rowCosts[i];
            }

        }

        // move coloumn 

        if(sc > hc){ // if home is upward from start position 

        for(int i = sc-1; i >= hc ; i --){
            ans += colCosts[i];
        }

        }

        else{ // if home is downward from start position

 for(int i = sc+1; i <= hc ; i ++){
            ans += colCosts[i];

        }
        }

        return ans;
    }
}