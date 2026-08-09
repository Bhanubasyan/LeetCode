class Solution {
    public int maxProfit(int[] prices) {
      int buy = Integer.MAX_VALUE;
      int pro = 0;

      for(int i : prices){
      if( i < buy) buy = i;
      else pro = Math.max(pro, i -buy);
      }
        return pro;
    }
}