class Solution {
    public int rob(int[] nums) {
        
      if(nums.length == 1)return nums[0];
      
      int n = nums.length;

      // exclude start element 
      int case1 = solve(nums, 1,n-1);

      //exclude last element 
      int case2 = solve(nums,0,n-2);

      return Math.max(case1 , case2);
    }

    int solve(int [] nums , int start , int end){
          int prev1 = nums[start];

        int prev2 =0;

        for(int i = start + 1; i<=end;i ++){

            int curr = Math.max(prev1 , nums[i] + prev2);

            prev2 = prev1;

            prev1 = curr ;

        }
        
        return prev1;
    }
}