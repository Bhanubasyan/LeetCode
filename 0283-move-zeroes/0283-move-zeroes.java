class Solution {
    public void moveZeroes(int[] nums) {

    int p1 = 0 , p2 = 0;

    while (p2 < nums.length){

        if(nums[p1] == 0 && nums[p2] != 0){
            int dummy = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = dummy;

            p1++;
            p2++;
        }

       else if(nums[p1] == 0 && nums[p2] == 0){

            p2++;
        }
       
else{
    p1++;
    p2++;
}
    }
        
    }
}