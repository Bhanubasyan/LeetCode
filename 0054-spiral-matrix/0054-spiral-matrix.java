class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        int top =0;
        int bottom = matrix.length -1;
        int left = 0;
        int right = matrix[0].length -1 ;


        while ( left <= right && top <= bottom){

            // left -> right
             for(int j = left ; j <= right ; j ++){
                ans.add(matrix[top][j]);
                

             }
             top ++;

             // top -> bottom
              for(int j = top ; j <= bottom; j++){
                ans.add(matrix[j][right]);
               
              }
 right --;

               // Right -> Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;

    }
}