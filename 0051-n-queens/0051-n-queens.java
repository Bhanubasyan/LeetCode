class Solution {
    List<List<String>> ans = new ArrayList<>();

        Set<Integer> cols = new HashSet<>();
          Set<Integer> dig1 = new HashSet<>();
            Set<Integer> dig2 = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {

        // we will fill queens row wise

        char[][] board = new char[n][n];

        // fill board by " . "

        for(int i =0 ; i<n ; i ++){
            Arrays.fill(board[i] , '.');
        }


// start placing queens 
        backTrack(0 , board , n);

        return ans;
        
    }


    void backTrack(int row , char[][] board, int n ){

        if(row == n){
         
         List<String> temp = new ArrayList<>();

         for(char[] s : board){
            temp.add(new String(s));
         }

         ans.add(temp);
         return;

        }

//validate columns 

        for(int col = 0; col < n; col ++){

            // chek coloumn is safe 
            if(cols.contains(col))
            continue;

            //chek diagonal 1

            if(dig1.contains(row - col))
            continue;

            if(dig2.contains(row + col))
            continue;


//choose 
            //place queen 

            board[row][col] = 'Q';


            //mark columns and diagonals as occupied 

            cols.add(col);
            dig1.add( row - col);
            dig2.add( row + col);

//explore next row 
backTrack(row + 1 , board , n);


//undo

//remove queen
board[row][col] = '.';

//remove columns and diagonals

cols.remove(col);
dig1.remove(row - col);
dig2.remove(row + col);

        }
    }
}