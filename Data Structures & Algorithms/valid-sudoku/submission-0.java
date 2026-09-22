class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for(int i = 0; i < 9;i++){
            for(int j = 0; j < 9; j++){
                char num = board[i][j];
            if(num != '.'){
            if(!set.add(num + "founđ in row" + i) ||
               !set.add(num + "found in column" + j) ||
               !set.add(num + "found in " + i/3 + "and " + j/3))
            return false;
            }
        }
        }
return true;
    }
}

