class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Rows First
        for(int i = 0;i<9;i++) {
            Set<Character> rowSet = new HashSet<>();
            for(int j = 0;j<9;j++) {
                char ch = board[i][j];
                if(ch == '.') continue;
                if(rowSet.contains(ch)) return false;
                rowSet.add(ch);
            }
        }
        //Columns Next
        for(int i = 0;i<9;i++) {
            Set<Character> colSet = new HashSet<>();
            for(int j = 0;j<9;j++) {
                char ch = board[j][i];
                if(ch == '.') continue;
                if(colSet.contains(ch)) return false;
                colSet.add(ch);
            }
        }
        // 3 * 3 Boxes next 
        for(int boxRow = 0;boxRow<9;boxRow+=3) {
            for(int colBox = 0;colBox<9;colBox+=3) {
                Set<Character> set = new HashSet<>();
                for(int i = boxRow;i<boxRow +3;i++) {
                    for(int j = colBox;j<colBox+3;j++) {
                        char ch = board[i][j];
                        if(ch == '.') continue;
                        if(set.contains(ch)) return false;
                        set.add(ch);
                    }
                }
            }
        }
        return true;
    }
}
